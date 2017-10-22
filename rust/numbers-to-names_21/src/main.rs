use std::io;
use std::collections::HashMap;

fn main() {
    let mut months = HashMap::new();
    months.insert(1, "January");
    months.insert(2, "February");
    months.insert(3, "March");
    months.insert(4, "April");
    months.insert(5, "May");
    months.insert(6, "June");
    months.insert(7, "July");
    months.insert(8, "August");
    months.insert(9, "September");
    months.insert(10, "October");
    months.insert(11, "November");
    months.insert(12, "December");

    println!("Please enter the number of the month: ");
    let month_num = read_input();

    let number = month_num.trim().parse::<usize>().unwrap();
    let month = match months.get(&number) {
        Some(month) => month,
        _ => "[Invalid month]"
    };

    println!("The name of the month is {}", month);
}

fn read_input() -> String {
    let mut input = String::new();
    io::stdin().read_line(&mut input)
        .expect("Error reading input");
    input
}
