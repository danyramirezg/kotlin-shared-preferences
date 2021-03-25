# Shared Preferences

Interface for accessing and modifying preference data returned by Context.getSharedPreferences(String, int). For any particular set of preferences, there is a single instance of this class that all clients share. Modifications to the preferences must go through an Editor object to ensure the preference values remain in a consistent state and control when they are committed to storage. Objects that are returned from the various get methods must be treated as immutable by the application.

Note: This class provides strong consistency guarantees. It is using expensive operations which might slow down an app. Frequently changing properties or properties where loss can be tolerated should use other mechanisms. For more details read the comments on Editor#commit() and Editor#apply().


## Resources:books:

* [Android Documentation](https://developer.android.com/reference/android/content/SharedPreferences)
* [Udemy Course](https://koombea.udemy.com/course/kotlin-android-developer-masterclass/learn/lecture/7449968#content)

---

## Demo

![Image - Demo](demo-1.gif)

## Author
* **Daniela Ramirez Gomez** - [danyramirezg](https://github.com/danyramirezg)

