use std::io;

fn main() {
    println!("Enter two strings and I'll tell you if they are anagrams:");
    println!("Enter the first string: ");
    let mut first = read_input_as_str();

    println!("Enter the second string: ");
    let mut second = read_input_as_str();

    first = first.trim().to_lowercase();
    second = second.trim().to_lowercase();

    let result = is_anagram(&first, &second);

    match result {
        true => println!("'{}' and '{}' are anagrams.", first, second),
        false => println!("'{}' and '{}' are NOT anagrams.", first, second)
    }
}

fn is_anagram(first_input: &str, second_input: &str) -> bool {
    if first_input.chars().count() != second_input.chars().count() {
        return false;
    }

    let mut first_split: Vec<String> = split_string(&first_input);
    let mut second_split: Vec<String> = split_string(&second_input);
    first_split.sort();
    second_split.sort();

    first_split.eq(&second_split)
}

fn read_input_as_str() -> String {
    let mut input = String::new();
    io::stdin().read_line(&mut input)
        .expect("Error reading input");
    input
}

fn split_string(string: &str) -> Vec<String> {
    string
        .split("")
        .map(|s| s.to_string())
        .collect()
}
