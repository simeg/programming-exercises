use std::io;

fn main() {
    println!("What is the first number?");
    let num_1: u32 = read_input();

    println!("What is the second number?");
    let num_2: u32 = read_input();

    println!("{} + {} = {}", num_1, num_2, (num_1 + num_2));
    println!("{} - {} = {}", num_1, num_2, (num_1 - num_2));
    println!("{} * {} = {}", num_1, num_2, (num_1 * num_2));
    println!("{} / {} = {}", num_1, num_2, (num_1 / num_2));
}

fn read_input() -> u32 {
    let mut input: String = String::new();

    io::stdin().read_line(&mut input)
        .expect("Error reading the input");

    input.trim().parse::<u32>().unwrap()
}
