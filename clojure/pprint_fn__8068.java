package clojure;

import clojure.lang.*;

public final class pprint_fn__8068 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "at");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "upcase-writer");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "capitalize-word-writer");
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "init-cap-writer");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "downcase-writer");
 }
 public pprint_fn__8068() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object offset2) {
  {
   Object __r5684;
   Object __r5685 = null;
   {
    Object and__3966__auto__3 = RT.get(params1, Keyword.intern(null, "at"));
    Object __r5686;
    Object __r5687 = and__3966__auto__3;
    if (__r5687 != null && !(__r5687 == Boolean.FALSE)) {
     __r5686 = RT.get(params1, Keyword.intern(null, "colon"));
    } else {
     __r5686 = and__3966__auto__3;
    }
    __r5685 = __r5686;
   }
   Object __r5688 = __r5685;
   if (__r5688 != null && !(__r5688 == Boolean.FALSE)) {
    __r5684 = const__2.getRawRoot();
   } else {
    Object __r5689;
    Object __r5690 = RT.get(params1, Keyword.intern(null, "colon"));
    if (__r5690 != null && !(__r5690 == Boolean.FALSE)) {
     __r5689 = const__3.getRawRoot();
    } else {
     Object __r5691;
     Object __r5692 = RT.get(params1, Keyword.intern(null, "at"));
     if (__r5692 != null && !(__r5692 == Boolean.FALSE)) {
      __r5691 = const__4.getRawRoot();
     } else {
      Object __r5693;
      Object __r5694 = const__5;
      if (__r5694 != null && !(__r5694 == Boolean.FALSE)) {
       __r5693 = const__6.getRawRoot();
      } else {
       __r5693 = null;
      }
      __r5691 = __r5693;
     }
     __r5689 = __r5691;
    }
    __r5684 = __r5689;
   }
   Object mod_case_writer4 = __r5684;
   return new clojure.pprint_fn__8068_fn__8069(mod_case_writer4);
  }
 }
}
