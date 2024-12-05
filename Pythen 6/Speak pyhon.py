
from gtts import gTTS
import os

# Prompt the user for input
user_input = input("Enter a string: ")

# Create a text-to-speech object
tts = gTTS(text=user_input, lang='en')

# Save the speech as an audio file
tts.save("output.mp3")

# Play the audio file (requires a media player)
os.system("start output.mp3")
