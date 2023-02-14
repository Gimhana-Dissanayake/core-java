public class Runner {

}

// Externalization:
// In java applications, the actual Serialization and Deserialization are
// performed by ObjectOutputStream and ObjectInputStream, not by developer,
// where in Serilization and Deserialization Developers job is just submit
// Serializable object to ObjectOutputStream and to read Deserialized object
// from ObjectInputStream.

// While peforming serizalization and deseralization deveopers are not having
// any controling over the data to perform maniupualtions.

// While performing Serialization and Desrialization if we want to manipulate
// data by performing the activities like security, encoding, decoding,
// compression, decompression,... we have to go for "Externalization"

// watch the lecture