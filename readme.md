## Volunteer Telegram bot for java

### Created using:
- maven
- java 11
- Spring boot
- telegram bot library for java(https://github.com/rubenlagus/TelegramBots)

### Bot functionality:
- Allows to submit help-requests from users

### Run:
1. Create bot via BotFather (`t.me/BotFather`)
2. Specify `token` and `username` in `application.yml`
3. Run `Application.main()`
4. Bot will be automatically registered, because it contains
`telegrambots-spring-boot-starter`
5. Now navigate to your bot and try to send some text to the bot


### Troubleshooting
If you observe issues during application start like `error removing old web-hook`, then make sure only one instance of bot is running, 
also check if you have provided good token.

### Demo
![](https://github.com/tarasvladyka/demo.gif)
