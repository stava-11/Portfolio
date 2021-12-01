module.exports = {
    development: {
        client: "sqlite3",
        connection: {
            filename: `./database/database.sqlite`
        },
        useNullAsDefault: true,
        debug: true
    }
}