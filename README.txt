@Author: Saksham Ohri
@Version:1.0

Description:
This is lab6 JDBC a 3-tier MVC Web Application with mariaDB database. 
This application presents a list of users, and enable the user to
add, delete(Make the user inactive) and update the users in the list. 
To delete/make a user inactive, the user just have to click the delete button next 
to the user info,and the application makes it inactive. 
To add a user, there is a under the list of users, which has email, first and last name,
password and role text area to be filled by user. After clicking Add button, the 
information is then shown in the user list.
To update a user, there is another form for updating below the add form. Layout for 
updating is similar to adding a user, but you can only update an existing user in the
user list. Click on the update button to save the changes to the list.
All the data is stored in the mariaDB database and with the help of HeidiSQL we can
see table and data inside the tables from backend.
This application consists of 4 layers , i.e Dataacess, models, services and servlets. 
It only consists of one JSP file, i.e Users.jsp.
 