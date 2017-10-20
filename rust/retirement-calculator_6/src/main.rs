extern crate time;

use std::io;
use std::cmp::Ordering;

fn main() {
    println!("What is your current age?");
    let age: i32 = read_input();

    println!("At what age would you like to retire?");
    let retirement_age: i32 = read_input();

    let years_left: i32 = retirement_age - age;

    match years_left.cmp(&0) {
        Ordering::Less => retire_already(),
        Ordering::Equal => retire_today(),
        Ordering::Greater => retire_later(years_left),
    }
}

fn retire_already() {
    println!("You can already retire!");
}

fn retire_today() {
    println!("You can retire today!");
}

fn retire_later(years_left: i32) {
    let current_year = time::now().tm_year + 1900;
    println!("You have {} years left until you can retire.", years_left);
    println!("It's {}, so you can retire {}.", current_year, (current_year + years_left));
}

fn read_input() -> i32 {
    let mut age = String::new();
    io::stdin().read_line(&mut age)
        .expect("Error reading input");
    age.trim().parse::<i32>().unwrap()
}
