<!DOCTYPE html>
<html lang="en-us">
<head>
    <title>Firestore Tutorial</title>
</head>

<body>
<div>  
    <header>
        
    </header>
    <main>
        <h1>
            Make a Post!
        </h1>
        <form action="back.php" method="post">
            <label for="comment">Comment:</label><br>
            <input type="text" id="comment" name="comment" value="<?php if(isset($commentChange)){echo $commentChange;} ?>"><br>
            <label for="pin">Pin Number:</label><br>
            <input type="number" id="pin" name="pin" value=""><br><br>
            <input type="hidden" name="commentID" value="<?php if(isset($commentID)){echo $commentID;} ?>">
            <input type="hidden" name="action" value="origSubmit">
            <input type="submit" value="Submit">
        </form> 
        <section class="comment">
            <h2>Comments</h2>
            <div id="comments">
            <?php if(isset($section)){
                echo $section;
            } ?>
            <!--  -->
            </div>
        </section>
    </main>
</div>
</body>
</html>
