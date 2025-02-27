def converter(money):
    return money*100

if __name__ == "__main__":
    rupee = int(input("Enter Rupees: "))
    print(f"{rupee} rupees : {converter(rupee)} paise")