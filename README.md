# Object Oriented Design Principles - CS5004 class of 2024. Final Project!

## Description:
- This project is very dear to me. For a long time, I have wanted to create the CallingOut application a social media platform where people can express their frustrations and improve relationships by addressing issues openly before they escalate. The app is designed to help users "call out" friends, family, partners, and others, aiming to reduce resentment, foster closure, and maintain healthy and smooth relationships. This approach promotes honesty and clarity, helping users address issues head on, let go of grudges, and avoid unnecessary misunderstandings. The ultimate goal is to help users gain closure, save time otherwise spent dwelling on unresolved feelings, and prevent relationships from deteriorating. Additionally, the app highlights how much time and emotional energy can be saved by discussing issues early. By being transparent and honest, users can either resolve their differences or end relationships amicably rather than enduring discomfort caused by hidden feelings. CallingOut is not just about "calling someone out," but also about creating a space for meaningful discussions before situations spiral out of control. Some might ask, "Why not just pick up the phone and call the person?" The reality is that we often don’t. Many of us hesitate for various reasons perhaps we’re vulnerable or fear the response, or maybe the person isn’t ready to hear what we have to say. So, if we’re not ready for a conversation, and someone “calls out” to us, we can choose to read it or listen to a voice message when we’re ready. Some people dislike confrontation altogether, while others prefer to live with assumptions rather than address uncomfortable truths. We find countless reasons to avoid difficult conversations, even with those that we love. We’re afraid of losing them, or we simply play along, pretending everything is fine. But the question remains: how long can we keep playing along? CallingOut may not solve every problem, but it offers a platform for expression. At the very least, it might help someone start a conversation that could lead to better understanding, closure, or even a stronger bond.


## Tech Stack:

- Java

## Key Concepts:

- Linked List for Flexibility: The CallOutList class implements a custom linked list, allowing dynamic addition, removal, and traversal of CallOuts.
- Functional Interfaces for Extensibility: Interfaces like UserAction and NotificationInterface promote clean, extensible code, ensuring that future features can be added seamlessly.
- Abstracted Notifications: The AbstractNotification class supports extensions like push notifications, ensuring scalability for future notification types.
- Recursion in Replies: Recursion simplifies displaying nested replies in the Reply class, maintaining clarity in threaded conversations.

- The design follows key SOLID principles:

    1. Single Responsibility Principle: Classes focus on one purpose: Each class has a single responsibility:
        - User: Manages user-specific data and actions.
        - CallOut: Represents a message with replies and reactions.
        - NotificationManager: Manages notifications.
    2. Open/Closed Principle, Classes are open for extension but closed for modification:
        - NotificationInterface allows adding new notification types like a PushNotification without altering existing code.
        - UserAction interface supports additional user actions without modifying CallOut.
    3. Liskov Substitution Principle (LSP), Subtypes replace their base types:
        - Reply and Reaction inherit from AbstractUserContent and work seamlessly wherever AbstractUserContent is expected.
    4. Interface Segregation Principle (ISP): Interfaces ensure classes implement only relevant methods.
        - NotificationInterface and UserAction define clear, independent contracts.
    5. Dependency Inversion Principle (DIP), High level modules depend on abstractions:
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

1. To implement Group CallOuts: Add functionality to allow users to create group chats by tagging the appropriate people.
    - Use Case: Users can create groups, such as "Family Members," to collaboratively resolve issues or discuss matters privately.

2. Functionality: Users can toggle a CallOut to "public" mode. Other users can view, react, and reply to public CallOuts. Implement a system to filter or moderate public discussions for quality and relevance.
    - Use Case: When users feel the need for outside perspectives, they can make their CallOut public and receive feedback or advice from the broader community.

3. Enhanced Notifications: Expand the notification system to include:
    - Push notifications.
    - Scheduled reminders for unresolved CallOuts.

4. Improved UI/UX: Transition from a console-based application to a graphical interface for a better user experience:
    - Visualize CallOuts, replies, and reactions hierarchically.
    - Allow drag-and-drop user tagging for group creation.

5. Voice Mail Functionality: Enable users to leave voicemails as part of their CallOuts.            
    - Recipients can listen to these messages at their convenience, promoting thoughtful communication when direct conversations aren't possible.
    - Use Case: Allow users to convey tone and emotions more effectively compared to text, especially when dealing with sensitive topics.

6. Analytics and Insights:
Provide users with insights about their communication patterns:
    - Number of resolved CallOuts.
    - Common reaction types.
    - Response times for group and individual discussions.


## Develeper:

- [Shorena Anzhilov](https://github.com/ShorenaK) 

## Support: 
- Any concerns or questions? Feel free to contact: Skadigital@gmail.com
