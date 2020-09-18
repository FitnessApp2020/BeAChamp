package com.fitnessapp2020.beachamp.view.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.fitnessapp2020.beachamp.R
import com.fitnessapp2020.beachamp.model.Athlete
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
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

        // Add continue button
        choose_sport_main_button3.setOnClickListener(this)

        auth = FirebaseAuth.getInstance()
    }

    override fun onClick(p0: View?) {
        registerUser()

        val intent = Intent(this, ChooseAreaActivity::class.java)
        startActivity(intent)
    }

    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        updateUI(currentUser)
    }

    fun registerUser() {
        name = name_editText_info.text.toString()
        email = email_editText_info.text.toString()
        password = password_editTextText_info.text.toString()

        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this)
            { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d(TAG, "createUserWithEmail:success")
                    val user = auth.currentUser
                    updateUI(user)

                    // Add user to firestore
                    firestore.collection("Athletes").document("id").set(user?.uid.toString())
                    firestore.collection("Athletes").document("email").set(email)
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