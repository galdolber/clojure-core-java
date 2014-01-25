package clojure;

import clojure.lang.*;

public final class pprint_fn__7530 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "type-tag");
 }
 public pprint_fn__7530() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object token1) {
  return RT.get(token1, Keyword.intern(null, "type-tag"));
 }
}
