<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:id="@+id/main"
android:layout_width="match_parent"
android:layout_height="match_parent"
tools:context=".MainActivity">

    <LinearLayout
android:layout_width="match_parent"
android:layout_height="match_parent"
android:gravity="center"
android:orientation="vertical">

        <TextView
android:id="@+id/txtChildActivity"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:background="#335926"
android:gravity="center"
android:padding="40dp"
android:text="This is main Activity"
android:textColor="#FFFFFF" />

        <Button
android:id="@+id/btnMove"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_margin="40dp"
android:text="Open child activity" />

        <Button
android:id="@+id/btnEx"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Move to Ex 7.2" />

        <Button
android:id="@+id/btnOtherEx"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Move to Ex 7.3" />
    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>