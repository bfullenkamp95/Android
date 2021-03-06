/**
 Copyright (C) 2016 Jared Perry, Jaron Somers, Warren Barnes, Scott Weidenkopf, and Grant Grimm
 Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 and associated documentation files (the "Software"), to deal in the Software without restriction,
 including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so,
 subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all copies\n
 or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH
 THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package seniordesign.ipfw.fw_trails_app;

import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
//Espresso Imports
import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;


import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;


/**
 * Created by Jaron on 1/17/2016.
 * Design Doc: https://drive.google.com/drive/u/1/folders/0B46qah_2e5yKbzdMbVNxUDNPeE0
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class LoginActivity_InstrumentationTest {


   private String usernameHint     = "Username";
   private String passwordHint     = "Password";
   private String button_OK_String = "Login";
   private String button_CANCEL_String = "Cancel";
   private String textView_NEW_USER    = "Don't have an account?";
   private String button_CreateNewAccount_String = "Create Account";

   // Preferred JUnit 4 mechanism of specifying the activity to be launched before each test
  // @Rule
  // public ActivityTestRule<LoginActivity> mActivityRule = new ActivityTestRule(LoginActivity.class);

   // Checks to see if the Username Edit Text is on the screen.
   @Test
   public void usernameEditTextExists() {
      onView(withId(R.id.usernameEditText)).check(matches(isDisplayed()));
   }

   // Verifies the Username hint is "Name" per UI Design Doc
   @Test
   public void usernameHintVerification(){
      onView(withId(R.id.usernameEditText)).check(matches(withHint(usernameHint)));
   }

   // Checks to see if the Password Edit Text is on the screen.
   @Test
   public void passwordEditTextExists() {
      onView(withId(R.id.passwordEditText)).check(matches(isDisplayed()));
   }

   // Verifies the Password hint is "Password" per UI Design Doc
   @Test
   public void passwordHintVerification(){
      onView(withId(R.id.passwordEditText)).check(matches(withHint(passwordHint)));
   }

   // Verifies the sponsor's image/logo per UI Design Doc
   @Test
   public void verifySponsorImage(){
      onView(withId(R.id.sponsorImage)).check(matches(isDisplayed()));
   }

   // Verifies the Ok button exists.
   @Test
   public void okButtonExists(){
      onView(withId(R.id.button_Login)).check(matches(isDisplayed()));
   }

   // Tests if the okay button has the correct text
   @Test
   public void okButtonTextVerification(){
      onView(withId(R.id.button_Login)).check(matches(withText(button_OK_String)));
   }


   //Tests that the text view for the new user area exists
   @Test
   public void newUserTextViewExists(){
      onView(withId(R.id.textViewNewUser)).check(matches(isDisplayed()));
   }

   // Tests that the text is the correct value for the new user static text
   @Test
   public void newUserTextViewVerification() {
      onView(withId(R.id.textViewNewUser)).check(matches(withText(textView_NEW_USER)));
   }

   // Tests if the create new account button exists
   @Test
   public void createAccountButtonExists(){
      onView(withId(R.id.button_CreateAccount)).check(matches(isDisplayed()));
   }

   // Tests that the text is the correct value for the new account button
   @Test
   public void createNewAccountButtonVerification() {
      onView(withId(R.id.button_CreateAccount)).check(matches(withText(button_CreateNewAccount_String)));
   }
}
