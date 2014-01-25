package clojure;

import clojure.lang.*;

public final class pprint_capitalize_word_writer_fn__7885_fn__7889 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "ref-set");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "count");
 }
 Object last_was_whitespace_QMARK_2;
 Object s5;
 public pprint_capitalize_word_writer_fn__7885_fn__7889(final Object last_was_whitespace_QMARK_2, final Object s5) {
  super();
  this.last_was_whitespace_QMARK_2 = last_was_whitespace_QMARK_2;
  this.s5 = s5;
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(this.last_was_whitespace_QMARK_2, (java.lang.Character.isWhitespace((char)((Character)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)this.s5), (int)RT.intCast(clojure.lang.Numbers.dec((long)clojure.lang.RT.count(((java.lang.Object)this.s5))))))).charValue()) ? Boolean.TRUE : Boolean.FALSE));
 }
}
