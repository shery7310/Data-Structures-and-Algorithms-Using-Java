class Testing {
    public String defangIPaddr(String address) {
        StringBuilder add = new StringBuilder();
        add.append("");
        for(int i = 0; i < address.length(); i++){
            if(address.charAt(i) == '.'){
                add.append("[.]");
                continue;
            }
            add.append(address.charAt(i));
        }
        address.replace('0', '0');
        return add.toString();
    }
    public static void main(String[] args) {
        // System.out.println("hey");
        // StringBuilder str = new StringBuilder("Ahmad");
        // System.out.println(str);
        // str = new StringBuilder("jajja");
        // System.out.println(str);

        System.out.println(Character.getNumericValue('#'));
        System.out.println((char)(64 + 26));
        
        for (String string : args) {
            
        }
        
    }
    private static char[] Char(int i) {
        return null;
    }
}