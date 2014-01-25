package clojure;

import clojure.lang.*;

public final class xml_fn__6926_fn__6949 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Keyword const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "struct");
  const__1 = (clojure.lang.Var)RT.var("clojure.xml", "element");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "symbol");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__5 = (clojure.lang.Var)RT.var("clojure.xml", "*stack*");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__7 = (clojure.lang.Var)RT.var("clojure.xml", "*current*");
  const__8 = (clojure.lang.Var)RT.var("clojure.xml", "*state*");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "element");
 }
 Object push_chars2;
 public xml_fn__6926_fn__6949(final Object push_chars2) {
  super();
  this.push_chars2 = push_chars2;
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object uri2, java.lang.Object local_name3, java.lang.Object q_name4, java.lang.Object atts5) {
  {
   Object attrs6 = new clojure.xml_fn__6926_fn__6949_attrs__6950(atts5);
   Object __r4527;
   if (clojure.lang.Numbers.isPos((long)((org.xml.sax.Attributes)atts5).getLength())) {
    __r4527 = ((IFn)attrs6).invoke(clojure.lang.PersistentArrayMap.EMPTY, Numbers.num(clojure.lang.Numbers.dec((long)((org.xml.sax.Attributes)atts5).getLength())));
   } else {
    __r4527 = null;
   }
   Object e7 = ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), ((clojure.lang.Keyword)clojure.lang.Keyword.intern((clojure.lang.Symbol)((clojure.lang.Symbol)((IFn)const__2.getRawRoot()).invoke(q_name4)))), __r4527);
   ((IFn)this.push_chars2).invoke();
   const__5.set(((IFn)const__6.getRawRoot()).invoke(const__5.get(), const__7.get()));
   const__7.set(e7);
   const__8.set(const__9);
  }
  return null;
 }
}
