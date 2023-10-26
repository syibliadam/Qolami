package com.example.qolami

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Practice(
    val name: String,
    val description: String,
): Parcelable
