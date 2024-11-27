# Final Project --- Object Oriented Design Principles.
## 12.16.2024
## Shoren K. Anzhilov

## Description:





## Tech Stack:

- Java

## Key Concepts:

- Linked List for Flexibility: The CallOutList class implements a custom linked list, allowing dynamic addition, removal, and traversal of CallOuts.
- Functional Interfaces for Extensibility: Interfaces like UserAction and NotificationInterface promote clean, extensible code, ensuring that future features can be added seamlessly.
- Abstracted Notifications: The AbstractNotification class supports extensions like push notifications, ensuring scalability for future notification types.
- Recursion in Replies: Recursion simplifies displaying nested replies in the Reply class, maintaining clarity in threaded conversations.

- The design follows key SOLID principles:

1. - Single Responsibility Principle: Classes focus on one purpose: Each class has a single responsibility:
        - User: Manages user-specific data and actions.
        - CallOut: Represents a message with replies and reactions.
        - NotificationManager: Manages notifications.
2. - Open/Closed Principle, Classes are open for extension but closed for modification:
        - NotificationInterface allows adding new notification types like a PushNotification without altering existing code.
        - UserAction interface supports additional user actions without modifying CallOut.
3. - Liskov Substitution Principle (LSP), Subtypes replace their base types:
        - Reply and Reaction inherit from AbstractUserContent and work seamlessly wherever AbstractUserContent is expected.
4. - Interface Segregation Principle (ISP): Interfaces ensure classes implement only relevant methods.
        - NotificationInterface and UserAction define clear, independent contracts.
5. - Dependency Inversion Principle (DIP), High level modules depend on abstractions:
        - NotificationManager depends on NotificationInterface, not specific implementations like EmailNotification.

- Functional Programming: Lambda expressions and higher-order functions (map, filter, reduce) are used in NotificationManager for efficient processing of notifications.

- Hierarchical Data Representation: CallOuts and their associated replies and reactions are represented hierarchically, leveraging linked list and ADT structures.

- The project loosely follows the MVC pattern:
    - Model: Classes like User, CallOut, and Notification.
    - View: Placeholder for future UI development.
    - Controller: Logic in Main facilitates interactions between components.


### Java Files:

- `Main.java`
- `NotificationType.java (Enum)`
- `ReactionType.java (Enum)`
- `CallOutStatusType.java (Enum)`
- `User.java`
- `UserAction.java (Interface)`
- `CallOut.java`
- `CallOutList.java`
- `CallOutNode.java`
- `Reply.java`
- `Reaction.java`
- `AbstractUserContent.java (Abstract Class)`
- `NotificationInterface.java (Interface)`
- `AbstractNotification.java (Abstract Class)`
- `NotificationManager.java`
- `PhoneNotification.java`
- `EmailNotification.java`

### UML Diagram to visualize class structure and relationships in the project.
![alt text](/images/uml.png)


## Future Improvements:

- To implement Group CallOuts: Add functionality to allow users to create group chats by tagging the appropriate people.
    - Use Case: Users can create groups, such as "Family Members," to collaboratively resolve issues or discuss matters privately.
- Functionality: Allow users to invite specific people to a CallOut Group. Enable threaded discussions and reactions within the group context.

- Public CallOuts for Community Input: Introduce an option for users to make a CallOut public.
    - Use Case: When users feel the need for outside perspectives, they can make their CallOut public and receive feedback or advice from the broader community.

- Functionality: Users can toggle a CallOut to "public" mode. Other users can view, react, and reply to public CallOuts. Implement a system to filter or moderate public discussions for quality and relevance.

- Enhanced Notifications: Expand the notification system to include:
    - Push notifications.
    - Scheduled reminders for unresolved CallOuts.

- Improved UI/UX: Transition from a console-based application to a graphical interface for a better user experience:
    - Visualize CallOuts, replies, and reactions hierarchically.
    - Allow drag-and-drop user tagging for group creation.
- Analytics and Insights:
Provide users with insights about their communication patterns:
    - Number of resolved CallOuts.
    - Common reaction types.
    - Response times for group and individual discussions.


## Develeper:

- [Shorena Anzhilov](https://github.com/ShorenaK) 

## Support: 
- Any concerns or questions? Feel free to contact: Skadigital@gmail.com
