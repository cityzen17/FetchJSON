package com.example.cityzen10.naxaassignment;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class CustomListAdapter extends ArrayAdapter<Person> {

    ArrayList<Person> persons;
    Context context;
    int resource;

    public CustomListAdapter(Context context, int resource, ArrayList<Person> persons) {
        super(context, resource, persons);
        this.persons = persons;
        this.context = context;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) getContext()
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.custom_list_layout, null, true);

        }
        Person person = getItem(position);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.avatar);
        Picasso.get().load(person.getAvatar()).into(imageView);

        TextView id = (TextView) convertView.findViewById(R.id.id);
        id.setText(String.valueOf(person.getId()));

        TextView firstname = (TextView) convertView.findViewById(R.id.first_name);
        firstname.setText(person.getFirstname());
        TextView lastname = (TextView) convertView.findViewById(R.id.last_name);
        lastname.setText(person.getLastname());

        return convertView;
    }
}
