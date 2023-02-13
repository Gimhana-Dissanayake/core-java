public class Runner {

}

// In Producer-Consumer problem, both producer and consumer are two threads,
// where producer has to produce an item then consumer has to consume that item,
// it has to be performed upto infinite number of times

// Logic:
// boolean flag: if its value is true then producer is producing an item and
// consumer must be in waiting state. If its value is false then consumer is
// consuming an item and prducer must be in waiting state.

// int count: It will manage item count

// If flag == true:
// Producer:
// Produce an Item
// giving turn to Consumer[flag = false].
// Giving notification to Consumer
// Going to waiting state.
// Consumer:
// waiting state

// If flag == false:
// Producer:
// waiting state
// Consumer:
// Consume the item
// Giving turn to Producer[flag = true]
// Giving Notification to Producer
// Going to wating state