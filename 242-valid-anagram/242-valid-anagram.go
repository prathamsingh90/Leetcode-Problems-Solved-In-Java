type SortRunes []rune

func(s SortRunes) Len() int {
    return len(s)
}

func(s SortRunes) Swap(x, y int) {
   s[x], s[y] = s[y], s[x]    
}

func (s SortRunes) Less(x, y int) bool {
    return s[x]<s[y]
}

func isAnagram(s string, t string) bool {
    s1, t1 := []rune(s), []rune(t)
    sort.Sort(SortRunes(s1))
    sort.Sort(SortRunes(t1))
        
    if string(s1)==string(t1){
        return true
    }

    return false
}