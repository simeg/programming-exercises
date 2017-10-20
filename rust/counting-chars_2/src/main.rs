use std::io;

fn main() {
    println!("What is the input string?");

    let mut input: String = String::new();

    io::stdin().read_line(&mut input)
        .expect("Failed to read line");

    let char_count: usize = input.trim().chars().count();

    println!("{} has {} characters.", input.trim(), char_count);
}
