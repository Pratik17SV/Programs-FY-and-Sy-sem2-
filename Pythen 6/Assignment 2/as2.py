import tkinter as tk
from tkinter import messagebox

# Placeholder function to simulate AI fact-checking logic
def ai_fact_check(news_text):
    """
    Placeholder function for AI fact-checking logic.
    In a real-world scenario, this function would call an AI model or an API to verify the news.
    """
    fake_news_keywords = ["fake", "hoax", "rumor", "unverified"]
    
    # Simple keyword-based check (replace this with an AI or API call)
    if any(keyword in news_text.lower() for keyword in fake_news_keywords):
        return False  # Fake news detected
    else:
        return True   # News seems legitimate

# Function to handle the fact-check process when the button is clicked
def check_news():
    news_text = news_entry.get("1.0", tk.END).strip()  # Get the news text from the entry widget
    if not news_text:
        messagebox.showerror("Error", "Please enter some news text to check.")
        return
    
    # Call the fact-checking function
    is_legit = ai_fact_check(news_text)
    
    if is_legit:
        result_label.config(text="The news seems legitimate.", fg="green")
    else:
        result_label.config(text="Warning: This news may be fake or unverified.", fg="red")

# Create the main application window
root = tk.Tk()
root.title("AI Fact Checker")

# Set window size
root.geometry("400x300")

# Create a label for instructions
instructions_label = tk.Label(root, text="Enter the news text below for fact-checking:")
instructions_label.pack(pady=10)

# Create a text entry widget for the news
news_entry = tk.Text(root, height=6, width=40)
news_entry.pack(pady=10)

# Create a button to check the news
check_button = tk.Button(root, text="Check News", command=check_news)
check_button.pack(pady=10)

# Create a label to display the result
result_label = tk.Label(root, text="")
result_label.pack(pady=20)

# Start the tkinter main loop
root.mainloop()
