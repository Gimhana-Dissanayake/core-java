public class Runner {

}
// If we design and execute any java application on the basis of Client-Server
// architecture or by distributing application logic over multiple
// machines[Local Machine and Remote machine] then that application is called as
// "Distributed Application".

// In distributed applications, it is frequent requriement to carray an object
// from local machine to remote machine and from remote machine to local machine
// over the network.

// To carry an object from local machine to remote machine we have to perform
// the follwing actions at local machine and at remote machine.

// At Local Machine:

// 1. Create Object with the data which we want to send to remote machine.

// 2. Seperate data from the Object.

// 3. Convert data from system representation to network representation

// 4. Send data to network.

// At Remote Machine:

// 1. Convert data from Network Represention to System representation.

// 2.Reconstruct an Object on the basis of data.

// Use the data from object.