package com.fitnessapp2020.beachamp.view.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.fitnessapp2020.beachamp.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.player_info.*

class PlayerInfoActivity : AppCompatActivity(), View.OnClickListener {

    private val firestore: FirebaseFirestore = FirebaseFirestore.getInstance()
    private lateinit var auth: FirebaseAuth
    private var TAG: String = "PlayerInfoActivity"

    private lateinit var name: String
    private lateinit var email: String
    private lateinit var password: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.player_info)
        auth = FirebaseAuth.getInstance()


        // Add click-listeners
        continue_button_info.setOnClickListener(this)
        logIn_textView_info.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (view == continue_button_info) {
            registerUser()
        }
        val intent = Intent(this, ChooseAreaActivity::class.java)
        startActivity(intent)
    }

    fun registerUser() {
        name = name_editText_info.text.toString()
        email = email_editText_info.text.toString()
        password = password_editTextText_info.text.toString()

        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d(TAG, "createUserWithEmail:success")
                    val user = auth.currentUser
                    updateUI(user)

                    val userData = hashMapOf(
                        "name" to name,
                        "email" to email,
                        "password" to password
                    )

                    if (user != null) {
                        firestore.collection("athletes").document(user.uid).set(userData)
                    }

                } else {
                    // If sign in fails, display a message to the user.
                    Log.w(TAG, "createUserWithEmail:failure", task.exception)
                    Toast.makeText(
                        baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT
                    ).show()
                    updateUI(null)
                }
            }
    }

    fun updateUI(user: FirebaseUser?) {
    }
}