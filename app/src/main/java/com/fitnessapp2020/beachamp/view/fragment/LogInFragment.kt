package com.fitnessapp2020.beachamp.view.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.fitnessapp2020.beachamp.R
import com.fitnessapp2020.beachamp.view.activity.ChooseAreaActivity
import com.fitnessapp2020.beachamp.view.activity.HomeActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.fragment_log_in.*

class LogInFragment : Fragment(), View.OnClickListener {
    private var TAG: String = "LoginFragment"
    var auth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_log_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        login_button.setOnClickListener(this)
    }

    fun logIn() {
        var email = editTextText_email_login.text.toString()
        var password = editTextText_password_login.text.toString()

        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(activity!!) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d(TAG, "signInWithEmail:success")
                    val user = auth.currentUser
                    val intent = Intent(activity, HomeActivity::class.java)
                    startActivity(intent)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w(TAG, "signInWithEmail:failure", task.exception)
                    Toast.makeText(activity, "Authentication failed.", Toast.LENGTH_SHORT).show()
                }
            }
    }

    override fun onClick(p0: View?) {
        logIn()
    }
}
