# Overview

This project is an example of a basic cross-platform desktop application that is built using Electron.js. I built this as a way to learn more about desktop applications and how to build them using website development languages. The software allows the user to sign their name to the main page of the application. The information is provided by the user in a single input field that then has a submit button. This information is saved in a SQLite3 database and then immediately presented back to the user so that they can see they have signed the page.

[Software Demo Video](https://youtu.be/rhq3g_m7Yks)

# Development Environment

I started the application by using electron-forge. This created a boiler-plate for me to add the additional features to. The database was designed using DB Browser for SQLite. This tool allowed me to design the database and view the data in the database. The application connects to an SQLite3 database using the Knex.js library. This library was used because the goal was to use only web languages and the ones that I had in mind were HTML, CSS, and Javascript.

# Useful Websites

* [Electron Forge](https://www.electronforge.io/)
* [Electron](https://www.electronjs.org/)
* [Knex.js](https://knexjs.org/)
* [DB For SQLite](https://sqlitebrowser.org/)

# Future Work

* The main item to fix is in the event listener. There is a bug that causes the event listener to build on itself. The first time the form is submitted it works correctly, but each time after that it makes the event call more and more. This causes the list of the names to be repeated over and over on the main page. I cheated the final view by removing the page list and then adding a new one each time the event listener is called. This provides the correct output on the screen, but does not fix the bug of multiple event listener calls with one submission of user input.
* The look of the list needs to be improved with CSS.
* I would like to add the ability for the user to be able to input a user name and password which would provide the opportunity for the user to edit or remove their name.