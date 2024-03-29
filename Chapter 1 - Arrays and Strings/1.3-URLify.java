// 1.3) URLify

// My Solution
public char[] URLify(char[] str, int num) {
	int count = 0;
	for (int i = 0; i < num; i++) {
		if (str[i] == ' ') {
			count++;
		}
	}

	for (int i = num - 1; i >= 0; i--) {
		while (count > 0) {
			if (str[i] == ' ') {
				str[i+(2*count)] = '0';
				str[i+(2*count) - 1] = '2';
				str[i+(2*count) - 2] = '%';
				count--;
			} else {
				str[i+(2*count)] = str[i];
			}
		}
	}
	return str;
}

// Book Solution
int replaceSpaces(char str[]) 
{ 
    // count spaces and find current length 
    int space_count = 0, i; 
    for (i = 0; str[i]; i++) 
        if (str[i] == ' ') 
            space_count++; 
  
    // Remove trailing spaces 
    while (str[i-1] == ' ') 
    { 
       space_count--; 
       i--; 
    } 
  
    // Find new length. 
    int new_length = i + space_count * 2 + 1; 
  
    // New length must be smaller than length 
    // of string provided. 
    if (new_length > MAX) 
        return -1; 
  
    // Start filling character from end 
    int index = new_length - 1; 
  
    // Fill string termination. 
    str[index--] = '\0'; 
  
    // Fill rest of the string from end 
    for (int j=i-1; j>=0; j--) 
    { 
        // inserts %20 in place of space 
        if (str[j] == ' ') 
        { 
            str[index] = '0'; 
            str[index - 1] = '2'; 
            str[index - 2] = '%'; 
            index = index - 3; 
        } 
        else
        { 
            str[index] = str[j]; 
            index--; 
        } 
    } 
  
    return new_length; 
} 