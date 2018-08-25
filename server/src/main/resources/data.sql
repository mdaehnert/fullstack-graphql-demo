insert into user (id, name, birthdate) values
(1001, 'Michael',    '1981-03-18'),
(1002, 'Hans-Peter', '1968-05-10');

insert into blogpost (id, user_id, created_at, subject, content) values
(10, 1001, '2018-08-04', 'Neuer Artikel im Entwickler-Magazin veröffentlicht.', 'Im September 2018 erscheint das neue Entwickler Magazin. Enthalten werden viele Artikel zum Thema GraphQL, dessen Verwendung sowie Pro- und Contra zur klassischen Verwendung von REST.'),
(11, 1001, '2018-08-04', 'Weiterer GraphQL Artikel auf der JAX Homepage online einsehbar.', 'Das Interesse an GraphQL reißt nicht ab. Ein weiterer Artikel ist online unter <a href="https://jaxenter.de/graphql-aws-lambda-api-serverless-72879">Artikel auf JAXenter</a> einsehbar.');
