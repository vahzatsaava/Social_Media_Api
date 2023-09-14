Цель проекта:
Разработать RESTful API для социальной медиа платформы, позволяющей пользователям регистрироваться, входить в систему, создавать посты, переписываться, подписываться на других пользователей и получать свою ленту активности.

Требования:
1. Аутентификация и авторизация:
Пользователи могут зарегистрироваться, указав имя пользователя, электронную почту и пароль.
Пользователи могут войти в систему, предоставив правильные учетные данные.
API должен обеспечивать защиту конфиденциальности пользовательских данных, включая хэширование паролей и использование JWT.
2. Управление постами:
Пользователи могут создавать новые посты, указывая текст, заголовок и прикрепляя изображения.
Пользователи могут просматривать посты других пользователей.
Пользователи могут обновлять и удалять свои собственные посты.
3. Взаимодействие пользователей:
Пользователи могут отправлять заявки в друзья другим пользователям. С этого момента, пользователь, отправивший заявку, остается подписчиком до тех пор, пока сам не откажется от подписки. Если пользователь, получивший заявку, принимает ее, оба пользователя становятся друзьями. Если отклонит, то пользователь, отправивший заявку, как и указано ранее, все равно остается подписчиком.
Пользователи, являющиеся друзьями, также являются подписчиками друг на друга.
Если один из друзей удаляет другого из друзей, то он также отписывается. Второй пользователь при этом должен остаться подписчиком.
Друзья могут писать друг другу сообщения (реализация чата не нужна, пользователи могу запросить переписку с помощью запроса)
4. Подписки и лента активности:
Лента активности пользователя должна отображать последние посты от пользователей, на которых он подписан.
Лента активности должна поддерживать пагинацию и сортировку по времени создания постов.
5. Обработка ошибок:
API должно обрабатывать и возвращать понятные сообщения об ошибках при неправильном запросе или внутренних проблемах сервера.
API должно осуществлять валидацию введенных данных и возвращать информативные сообщения при неправильном формате


1) To start the Docker container, navigate to the docker-local-run directory and run database.

2) After launching your IDE, add the roles for the User by executing the following SQL query:-   insert into roles(name) values ('ROLE_USER'),('ROLE_ADMIN');

3) Once you've completed the setup, access the provided URL: http://localhost:8085/swagger-ui/index.html#/
