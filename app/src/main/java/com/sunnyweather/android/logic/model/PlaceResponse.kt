package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 * 该文件用于定义类和属性
 */
class PlaceResponse(val status: String, val places: List<Place>)

class Place(val name: String, val location: Location, @SerializedName("formatted_address") val address: String)

class Location(val lng: String, val lat: String)