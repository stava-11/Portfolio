
<?php 
    require_once 'vendor/autoload.php';
    use Google\Cloud\Firestore\FirestoreClient;

    /**
     * Initialize Cloud Firestore with default project ID.
     */
    function setup_client_create(string $projectId = null)
    {
        // Create the Cloud Firestore client
        if (empty($projectId)) {
            // The `projectId` parameter is optional and represents which project the
            // client will act on behalf of. If not supplied, the client falls back to
            // the default project inferred from the environment.
            $db = new FirestoreClient();
            printf('Created Cloud Firestore client with default project ID.' . PHP_EOL);
        } else {
            $db = new FirestoreClient([
                'comments-6490a' => $projectId,
            ]);
            printf('Created Cloud Firestore client with project ID: %s' . PHP_EOL, $projectId);
        }
    }
   
$action = filter_input(INPUT_POST, 'action');
 if ($action == NULL){
  $action = filter_input(INPUT_GET, 'action');
 }

switch ($action) {
    case 'origSubmit':
        $comment = filter_input(INPUT_POST, 'comment', FILTER_SANITIZE_STRING);
        // $comment = isset($_POST['comment']) ? $_POST['comment'] : '';
        $pin = filter_input(INPUT_POST, 'pin', FILTER_SANITIZE_NUMBER_INT);
        if (!empty($comment) && !empty($pin)){
            $section =  '<form action="back.php" method="post">';
            // $section .= '<p">'.$comment.'</p>';
            $section .= 'Comment: <p>'.$comment.'<p>';
            $section .= '<input type="text" name="commentHidden" value="'.$comment.'" hidden><br>';
            $section .= 'Pin: <input type="text" name="pin"><br>';
            $section .= '<input type="submit" name="Edit" value="Edit">';
            $section .= '<input type="hidden" name="action" value="editDetails">';
            $section .= '<input type="hidden" name="pinHidden" value="'.$pin.'"></form>';
        } elseif(!empty($comment)) {
            $commentChange = $comment;
            $section = "<p>Please enter a pin to make a submission</p>";
            $section .= $fs->getDocument('comment1');

        }

        include './index.php';
        exit;

    case 'editDetails':
        $comment = filter_input(INPUT_POST, 'commentHidden', FILTER_SANITIZE_STRING);
        // $comment = isset($_POST['comment']) ? $_POST['comment'] : '';
        $pin = filter_input(INPUT_POST, 'pin', FILTER_SANITIZE_NUMBER_INT);
        $pinHidden = filter_input(INPUT_POST, 'pinHidden', FILTER_SANITIZE_NUMBER_INT);
        if (!empty($comment) && !empty($pin) && ($pin == $pinHidden)){
            $commentChange = $comment;
            $section =  '<form action="back.php" method="post">';
            $section .= '<input type="text" name="comment" value="'.$comment.'">';
            $section .= 'Pin: <input type="text" name="pin"><br>';
            $section .= '<input type="submit" name="Edit" value="Edit">';
            $section .= '<input type="hidden" name="action" value="origSubmit">';
            $section .= '<input type="hidden" name="pinHidden" value="'.$pin.'"></form>';
            $section = "<p>Make the change</p>";
        } else {
            $section =  '<form action="back.php" method="post">';
            // $section .= '<p">'.$comment.'</p>';
            $section .= 'Comment: <p>'.$comment.'<p>';
            $section .= '<input type="text" name="commentHidden" value="'.$comment.'" hidden><br>';
            $section .= 'Pin: <input type="text" name="pin"><br>';
            $section .= '<input type="submit" name="Edit" value="Edit">';
            $section .= '<input type="hidden" name="action" value="editDetails">';
            $section .= '<input type="hidden" name="pinHidden" value="'.$pinHidden.'"></form>';
            $section .= "<p>Not the correct pin!</p>";
        }

        include './index.php';
        exit;

    default:  
        include './index.php';
}

