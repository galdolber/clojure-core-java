package clojure;

import clojure.lang.*;

public final class pprint_capitalize_word_writer_fn__7885_fn__7891 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "ref-set");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "char");
 }
 Object x2;
 Object last_was_whitespace_QMARK_2;
 public pprint_capitalize_word_writer_fn__7885_fn__7891(final Object x2, final Object last_was_whitespace_QMARK_2) {
  super();
  this.x2 = x2;
  this.last_was_whitespace_QMARK_2 = last_was_whitespace_QMARK_2;
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(this.last_was_whitespace_QMARK_2, (java.lang.Character.isWhitespace((char)clojure.lang.RT.charCast(((java.lang.Object)this.x2))) ? Boolean.TRUE : Boolean.FALSE));
 }
}
