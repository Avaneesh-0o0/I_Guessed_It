
🧠 #I Guessed It - Android App
A fun Android app that guesses the number you're thinking of!

📌 Features
✅ User enters a number range
✅ App asks questions to guess the number
✅ Interactive UI with Yes/No buttons
✅ Shows the guessed number at the end
✅ Plays a video (akshay.mp4) after revealing the answer

📂 Project Structure
pgsql
Copy
Edit
📦 IGuessedIt  
 ┣ 📂 app  
 ┃ ┣ 📂 src  
 ┃ ┃ ┣ 📂 main  
 ┃ ┃ ┃ ┣ 📂 java/com/example/iguessedit  
 ┃ ┃ ┃ ┃ ┣ 📜 MainActivity.java  
 ┃ ┃ ┃ ┃ ┣ 📜 MainActivity2.java  
 ┃ ┃ ┃ ┃ ┣ 📜 MainActivity3.java  
 ┃ ┃ ┃ ┣ 📂 res  
 ┃ ┃ ┃ ┃ ┣ 📂 layout  
 ┃ ┃ ┃ ┃ ┣ 📜 activity_main.xml  
 ┃ ┃ ┃ ┃ ┣ 📜 activity_main2.xml  
 ┃ ┃ ┃ ┃ ┣ 📜 activity_main3.xml  
 ┃ ┃ ┃ ┃ ┣ 📂 raw  
 ┃ ┃ ┃ ┃ ┃ ┣ 📜 akshay.mp4  
 ┃ ┃ ┃ ┣ 📜 AndroidManifest.xml  
 ┃ ┃ ┃ ┣ 📜 build.gradle  
 ┣ 📜 README.md  
📲 Installation
Clone the repository:
bash
Copy
Edit
git clone https://github.com/yourusername/IGuessedIt.git
Open Android Studio and select Open an Existing Project.
Build and Run the app on an emulator or a real device.
🛠️ Tech Stack
Language: Java
IDE: Android Studio
UI Components: EditText, ImageButton, TextView, VideoView
📜 How It Works
1️⃣ User enters a number range in MainActivity2.
2️⃣ App displays binary-based number sets to narrow down the choice.
3️⃣ User answers Yes/No until the number is found.
4️⃣ Final answer is displayed, VideoView starts playing akshay.mp4.

🎥 Video Playback
The video file akshay.mp4 is stored in res/raw.
It plays with audio and does not loop.
It starts automatically when the app finds the number.
🚀 Future Enhancements
🔹 Add animations during number selection.
🔹 Improve UI with better layouts and themes.
🔹 Allow users to choose their own video file.

💡 Contributing
Feel free to fork the repo and submit pull requests!
For major changes, open an issue first.
📄 License
This project is licensed under the MIT License.














Search

Reason


