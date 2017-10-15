def isAnagram(word1, word2):
    if len(word1) != len(word2):
        return False

    return sorted(list(word1)) == sorted(list(word2))

def main():
    word1 = input('Enter the first string: ')
    word2 = input('Enter the second string: ')
    result = isAnagram(word1, word2)
    if result:
        print('"%s" and "%s" are anagrams.' % (word1, word2))
    else:
        print('"%s" and "%s" are not anagrams.' % (word1, word2))

main()
