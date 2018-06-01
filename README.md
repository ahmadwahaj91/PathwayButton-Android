# PathwayButton-Android

Pathway Button is a Custom Animated Button. Its changes its orientation i.e. it gets animated when a user clicks on it and get backs to its original position once the animation is complete.


### How to Use (Usage Sample)

A step by step approach to guide you through, how to use the library

do this in your root build.gradle at the end of repositories:

```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Add the dependency:

```
dependencies {
    compile 'com.github.ahmadwahaj91:PathwayButton-Android:0.1.0'
}
```

End with an example of getting some data out of the system or using it for a little demo

Define a view in your layout file:

```
 <?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="bottom"
    android:orientation="vertical"
    tools:context="com.db.pathwaybutton.MainActivity">

    <customlibraries.db.com.pathwaybutton.PathwayButton
        android:id="@+id/pathway"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:layout_marginBottom="20dp"
        android:layout_marginEnd="20dp"
        android:layout_marginStart="20dp"
        android:background="@color/colorPrimary"
        android:gravity="center"
        android:text="ENTER DETAILS"
        android:textColor="#ffffff" />

</LinearLayout>

```

And (or) add following code to your activity:

```
public class MainActivity extends AppCompatActivity {
    PathwayButton pathwayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pathwayButton = findViewById(R.id.pathway);
        pathwayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "You just pressed the Pathway Button", Toast.LENGTH_LONG).show();
            }
        });

    }
}

```

## Authors

* **Ahmad Wahaj** - *Initial work* - [Ahmad Wahaj](https://github.com/ahmadwahaj91)

