insert into role(created_by, created_time, update_by, updated_time, enabled, description)
VALUES ('Talha Turkyolu', '2021-03-29 00:00:00', 'Talha Turkyolu', '2021-03-29 00:00:00', true, 'Root');
VALUES ('Admin', '2021-03-29 00:00:00', 'Admin', '2021-03-29 00:00:00', true, 'Admin');
VALUES ('Manager', '2021-03-29 00:00:00', 'Manager', '2021-03-29 00:00:00', true, 'Manager');
VALUES ('Employee', '2021-03-29 00:00:00', 'Employee', '2021-03-29 00:00:00', true, 'Employee');




insert into user_table(created_by, created_time, update_by, updated_time, email, enabled,
                  first_name, last_name, password, phone)
VALUES ('Talha Turkyolu', '2021-03-29 00:00:00', 'Talha Turkyolu', '2021-03-29 00:00:00',
'turkyolutalha@gmail.com', true, 'Talha', 'Turkyolu',
'Abc1', '6157203025');

INSERT INTO user_role (user_id, role_id) VALUES
((SELECT u.id from user_table u WHERE u.created_by = 'Talha Turkyolu'),
(SELECT r.id from role r WHERE r.created_by = 'Talha Turkyolu'));