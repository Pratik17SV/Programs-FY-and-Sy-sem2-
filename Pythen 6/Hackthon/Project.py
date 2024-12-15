import tkinter as tk
from tkinter import messagebox
from tkinter.filedialog import askopenfilename

def scan_email():
    # Placeholder function to simulate email scanning
    messagebox.showinfo("Scan Email", "Scanning Gmail for financial records...")

def generate_credit_score():
    # Placeholder function for generating credit score
    sales = daily_sales_entry.get()
    goods = goods_type_entry.get()

    if not sales or not goods:
        messagebox.showerror("Input Error", "Please provide all required inputs.")
        return

    # Dummy logic to calculate credit score and loan suggestion
    try:
        sales = float(sales)
        score = min(100, sales / 10)  # Simplistic credit score logic
        loan_amount = sales * 30  # Hypothetical loan amount
        repayment_plan = f"Repay over {int(loan_amount / 1000)} months."

        result = f"Credit Score: {score}\nLoan Amount: ${loan_amount:.2f}\nRepayment Plan: {repayment_plan}"
        result_label.config(text=result)
    except ValueError:
        messagebox.showerror("Input Error", "Please enter a valid number for daily sales.")

def clear_results():
    daily_sales_entry.delete(0, tk.END)
    goods_type_entry.delete(0, tk.END)
    result_label.config(text="")

# Initialize the main application window
root = tk.Tk()
root.title("Micro-Credit Scoring Tool")
root.geometry("400x400")

# Title Label
title_label = tk.Label(root, text="Instant Micro-Credit Scoring", font=("Arial", 16, "bold"))
title_label.pack(pady=10)

# Email Scan Button
scan_button = tk.Button(root, text="Scan Gmail for Financial Records", command=scan_email)
scan_button.pack(pady=10)

# Input Fields
input_frame = tk.Frame(root)
input_frame.pack(pady=10)

daily_sales_label = tk.Label(input_frame, text="Daily Sales ($):")
daily_sales_label.grid(row=0, column=0, padx=5, pady=5, sticky="e")
daily_sales_entry = tk.Entry(input_frame)
daily_sales_entry.grid(row=0, column=1, padx=5, pady=5)

goods_type_label = tk.Label(input_frame, text="Type of Goods Sold:")
goods_type_label.grid(row=1, column=0, padx=5, pady=5, sticky="e")
goods_type_entry = tk.Entry(input_frame)
goods_type_entry.grid(row=1, column=1, padx=5, pady=5)

# Generate Credit Score Button
generate_button = tk.Button(root, text="Generate Credit Score", command=generate_credit_score)
generate_button.pack(pady=10)

# Result Label
result_label = tk.Label(root, text="", font=("Arial", 12), justify="left")
result_label.pack(pady=10)

# Clear Button
clear_button = tk.Button(root, text="Clear", command=clear_results)
clear_button.pack(pady=10)

# Run the application
root.mainloop()
