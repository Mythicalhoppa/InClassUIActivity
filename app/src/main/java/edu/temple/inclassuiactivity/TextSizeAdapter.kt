package edu.temple.inclassuiactivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
class TextSizeAdapter(val context: Context, val numbers: Array<Int>) : BaseAdapter() {

    override fun getCount(): Int {
        return numbers.size
    }

    override fun getItem(position: Int): Any {
        return numbers[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView = TextView(context)
        textView.text = numbers[position].toString()
        textView.textSize = numbers[position].toFloat()
        return textView
    }
}
