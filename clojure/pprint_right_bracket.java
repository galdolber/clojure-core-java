package clojure;

import clojure.lang.*;

public final class pprint_right_bracket extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "right");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "bracket-info");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "def");
 }
 public pprint_right_bracket() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1) {
  return RT.get(RT.get(RT.get(this1, Keyword.intern(null, "def")), Keyword.intern(null, "bracket-info")), Keyword.intern(null, "right"));
 }
}
