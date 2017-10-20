use std::io;

fn main() {

    println!("What is your name?");

    let mut guess = String::new();

    io::stdin().read_line(&mut guess)
        .expect("Failed to read line");

    guess = String::from(guess.trim());

    println!("Hello, {}, nice to meet you!", guess);
}
