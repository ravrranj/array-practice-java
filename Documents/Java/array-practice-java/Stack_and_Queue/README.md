# Stacks and Queues in Java

This folder contains Java implementations of data structures related to Stacks and Queues.

---

## ✅ Implemented So Far

### Stack using Array
Custom `MyStackArray` class with:
- `push()`
- `pop()`
- `peek()`
- `isEmpty()`
- `isFull()`

### Stack using Linked List
This implementation uses a singly linked list to simulate stack behavior.

Operations:
- `push(int data)`: Adds a node at the beginning
- `pop()`: Removes the node at the beginning
- `peek()`: Returns the top element
- `isEmpty()`: Checks if the stack is empty

### Queue using Array
- `enqueue(int data)`
- `dequeue()`
- `peek()`
- `isEmpty()`
- `isFull()`

### Queue using Linked List
- `enqueue()`
- `dequeue()`
- `peek()`
- `isEmpty()`

### Circular Queue
Implements a circular buffer to efficiently utilize space.
- `enqueue(int data)`
- `dequeue()`
- `peek()`
- `isEmpty()`
- `isFull()`

### Reverse First K Elements of Queue
Given a queue and a number K, reverses the first K elements in the queue.

---

## 📂 File Descriptions

- `MyStackArray.java` – Stack implementation using an array.
- `StackLinkedList.java` – Stack implementation using a Linked List.
- `QueueArray.java` – Queue implementation using a fixed-size array.
- `QueueLinkedList.java` – Queue implementation using Linked List.
- `CircularQueue.java` – Circular queue implementation using array.
- `ReverseKQueue.java` – Reverses the first K elements in a queue.

---

## 📦 Upcoming

- Stack using two Queues
- Queue using two Stacks

---

## 📌 How to Run

Make sure Java is installed. Then run:

```bash
javac FileName.java
java FileName


---

#### 🧠 3. **Push to GitHub**

Back in your terminal:

```bash
cd path/to/array-practice-java
git add stacks-queues/
git commit -m "Add Stack using Array implementation in stacks-queues folder"
git push origin main


👨‍💻 Author
Ravi Ranjan (ChunChun)
GitHub Profile



# After saving the file:
git add README.md
git commit -m "Update README with CircularQueue and ReverseKQueue details"
git push origin main