package com.example.short_message;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static void ShowShortTimeMessage(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void ShowLongTimeMessage(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
