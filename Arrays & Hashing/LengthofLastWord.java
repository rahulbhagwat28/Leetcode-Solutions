              class LengthofLastWord {
                  public int lengthOfLastWord(String s) {

                      s = s.trim();

                      int i = s.length() - 1;
                      int count = 0;

                      if (s.length() == 1)
                          return 1;

                      while (i >= 0 && s.charAt(i) != ' ') {
                          System.out.println(i);
                          i--;
                          count++;
                      }

                      return count;

                  }
              }