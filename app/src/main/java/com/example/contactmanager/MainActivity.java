package com.example.contactmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.contactmanager.data.DatabaseHandler;
import com.example.contactmanager.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//    private ListView listView;
//    private ArrayList<String> contactArrayList;
//    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        listView = findViewById(R.id.listview);
//        contactArrayList = new ArrayList<>();
          DatabaseHandler db = new DatabaseHandler(MainActivity.this);

//        db.addContact(new Contact("Shabnam","345678219"));
//        db.addContact(new Contact("Javed","567329"));
//        db.addContact(new Contact("Jahangeer","3058361"));
//        db.addContact(new Contact("Zakir","38761234"));
//        db.addContact(new Contact("Tresa","05673214"));
//        db.addContact(new Contact("Aayan","49276345"));
//        db.addContact(new Contact("Aayat","1987042678"));



        //Log.d("count","onCreate: " + db.getCount());

       // Create contact object first
        Contact shabnam = new Contact();
        shabnam.setName("Shabnam");
        shabnam.setPhoneNumber("9876543210");
        db.addContact(shabnam);

       //Log.d("main"," Id: " + shabnam.getId() + " Name: " + shabnam.getName() + " Phone no: "  + shabnam.getPhoneNumber());
        Contact json = new Contact();
        json.setName("Json");
        json.setPhoneNumber("9876543456");
        db.addContact(json);
        // Get 1 contact

        //Contact c = db.getContact(1);
      //  Log.d("Main","onCreate:" + c.getName() + "," + c.getPhoneNumber());

       // c.setName("Newjermy");
        //c.setPhoneNumber("45677");

       // int updateRow = db.updateContact(c);
        //Log.d("RowId","onCreate: " + updateRow);



        //delete a contact

        //db.deleteContact(c);


        List<Contact> contactList = db.getAllContacts();

        for(Contact contact: contactList){
            Log.d("main","onCreate:" +contact.getName());
           // contactArrayList.add(contact.getName());
        }

        //create Array adapter
       // arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,contactArrayList);
        //add to our listview
        //listView.setAdapter(arrayAdapter);

    }
}
