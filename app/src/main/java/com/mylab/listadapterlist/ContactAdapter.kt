package com.mylab.listadapterlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.mylab.listadapterlist.databinding.ItemListBinding


class ContactAdapter : ListAdapter<Contact, ContactAdapter.ContactHolder>(Companion) {

    companion object : DiffUtil.ItemCallback<Contact>() {
        override fun areItemsTheSame(oldItem: Contact, newItem: Contact): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Contact, newItem: Contact): Boolean {
            return oldItem.id == newItem.id

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemListBinding.inflate(layoutInflater)
        return ContactHolder(binding)

    }

    override fun onBindViewHolder(holder: ContactHolder, position: Int) {
        val currentContact = getItem(position)
        holder.binding.contact = currentContact
        holder.binding.executePendingBindings()

    }

    class ContactHolder(val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root)












}