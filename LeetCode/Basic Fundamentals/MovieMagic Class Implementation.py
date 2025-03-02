class MovieMagic:
    def __init__(self):
        self.year = 0
        self.title = ""
        self.rating = 0.0

    def accept(self):
        self.year = int(input("Enter the year of release: "))
        self.title = input("Enter the title of the movie: ")
        self.rating = float(input("Enter the rating of the movie: "))

    def display(self):
        print(f"Title: {self.title}")
        if 0.0 <= self.rating <= 2.0:
            print("Flop")
        elif 2.1 <= self.rating <= 3.4:
            print("Semi-hit")
        elif 3.5 <= self.rating <= 4.5:
            print("Hit")
        elif 4.6 <= self.rating <= 5.0:
            print("Super Hit")
        else:
            print("Invalid rating")

# Main method to create an object and call methods
movie = MovieMagic()
movie.accept()
movie.display()
