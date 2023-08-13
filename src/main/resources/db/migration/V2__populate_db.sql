INSERT INTO client (NAME)
VALUES ('Client 1'),
       ('Client 2'),
       ('Client 3'),
       ('Client 4'),
       ('Client 5'),
       ('Client 6'),
       ('Client 7'),
       ('Client 8'),
       ('Client 9'),
       ('Client 10');
INSERT INTO planet (ID, NAME)
VALUES ('Mars', 'Planet 1'),
       ('Ven', 'Planet 2'),
       ('Earth1', 'Planet 3'),
       ('MER1', 'Planet 4'),
       ('Yup1', 'Planet 5');
INSERT INTO ticket (CLIENT_ID, FROM_PLANET_ID, TO_PLANET_ID)
VALUES (1, 'MARS', 'VEN'),
       (2, 'EARTH1', 'MER1'),
       (3, 'YUP1', 'MER1'),
       (4, 'MARS', 'EARTH1'),
       (5, 'VEN', 'MARS'),
       (6, 'MER1', 'VEN'),
       (7, 'MARS', 'MER1'),
       (8, 'MARS', 'YUP1'),
       (9, 'YUP1', 'EARTH1'),
       (10, 'VEN', 'YUP1');


