| Scope         | Description                                   | Typical Use Case                            |
| ------------- | --------------------------------------------- | ------------------------------------------- |
| `singleton`   | One instance per Spring container (default)   | Most beans in apps (services, repositories) |
| `prototype`   | New instance every time the bean is requested | State-full or short-lived objects           |
| `request`     | One instance per HTTP request (web apps only) | Controllers handling request-specific data  |
| `session`     | One instance per HTTP session (web apps)      | Session-scoped user data                    |
| `application` | One instance per ServletContext               | Shared resources across web app             |
| `websocket`   | One instance per WebSocket session            | WebSocket-scoped beans                      |
