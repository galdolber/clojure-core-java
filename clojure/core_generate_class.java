package clojure;

import clojure.lang.*;

public final class core_generate_class extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Keyword const__12;
 public static final clojure.lang.Keyword const__13;
 public static final clojure.lang.Keyword const__14;
 public static final clojure.lang.Keyword const__15;
 public static final clojure.lang.Keyword const__16;
 public static final clojure.lang.Keyword const__17;
 public static final clojure.lang.Keyword const__18;
 public static final clojure.lang.Keyword const__19;
 public static final clojure.lang.Keyword const__20;
 public static final clojure.lang.Keyword const__21;
 public static final clojure.lang.Var const__22;
 public static final clojure.lang.Var const__23;
 public static final clojure.lang.Var const__24;
 public static final java.lang.Object const__25;
 public static final clojure.lang.Var const__26;
 public static final clojure.lang.Var const__27;
 public static final java.lang.Object const__28;
 public static final clojure.lang.Var const__29;
 public static final clojure.lang.Var const__30;
 public static final clojure.lang.Var const__31;
 public static final clojure.lang.Var const__32;
 public static final java.lang.Object const__33;
 public static final java.lang.Object const__34;
 public static final java.lang.Object const__35;
 public static final java.lang.Object const__36;
 public static final java.lang.Object const__37;
 public static final java.lang.Object const__38;
 public static final java.lang.Object const__39;
 public static final java.lang.Object const__40;
 public static final clojure.lang.Var const__41;
 public static final clojure.lang.Var const__42;
 public static final clojure.lang.Var const__43;
 public static final clojure.lang.Var const__44;
 public static final clojure.lang.Var const__45;
 public static final clojure.lang.Var const__46;
 public static final clojure.lang.Var const__47;
 public static final clojure.lang.Var const__48;
 public static final clojure.lang.Var const__49;
 public static final clojure.lang.Var const__50;
 public static final clojure.lang.Var const__51;
 public static final clojure.lang.Var const__52;
 public static final clojure.lang.Var const__53;
 public static final clojure.lang.Var const__54;
 public static final clojure.lang.Var const__55;
 public static final clojure.lang.Var const__56;
 public static final clojure.lang.Var const__57;
 public static final clojure.lang.Var const__58;
 public static final clojure.lang.Var const__59;
 public static final clojure.lang.Var const__60;
 public static final clojure.lang.Var const__61;
 public static final clojure.lang.Var const__62;
 public static final clojure.lang.Var const__63;
 public static final clojure.lang.Var const__64;
 public static final clojure.lang.Var const__65;
 public static final clojure.lang.Var const__66;
 public static final clojure.lang.Var const__67;
 public static final clojure.lang.Var const__68;
 public static final clojure.lang.Var const__69;
 public static final clojure.lang.Var const__70;
 public static final clojure.lang.IPersistentStack const__71;
 public static final clojure.lang.Var const__72;
 public static final java.lang.Object const__73;
 public static final clojure.lang.Var const__74;
 public static final clojure.lang.Var const__75;
 public static final clojure.lang.Var const__76;
 public static final java.lang.Object const__77;
 public static final clojure.lang.Keyword const__78;
 public static final clojure.lang.Var const__79;
 public static final clojure.lang.Keyword const__80;
 public static final clojure.lang.Keyword const__81;
 public static final clojure.lang.Var const__82;
 public static final clojure.lang.Var const__83;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "validate-generate-class-options");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "prefix");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "load-impl-ns");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "impl-ns");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "ns-name");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "merge");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "extends");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "exposes-methods");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "exposes");
  const__13 = (clojure.lang.Keyword)Keyword.intern(null, "state");
  const__14 = (clojure.lang.Keyword)Keyword.intern(null, "init");
  const__15 = (clojure.lang.Keyword)Keyword.intern(null, "name");
  const__16 = (clojure.lang.Keyword)Keyword.intern(null, "factory");
  const__17 = (clojure.lang.Keyword)Keyword.intern(null, "implements");
  const__18 = (clojure.lang.Keyword)Keyword.intern(null, "methods");
  const__19 = (clojure.lang.Keyword)Keyword.intern(null, "post-init");
  const__20 = (clojure.lang.Keyword)Keyword.intern(null, "main");
  const__21 = (clojure.lang.Keyword)Keyword.intern(null, "constructors");
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__23 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__24 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__25 = (java.lang.Object)0L;
  const__26 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__27 = (clojure.lang.Var)RT.var("clojure.core", "the-class");
  const__28 = (java.lang.Object)java.lang.Object.class;
  const__29 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__30 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__31 = (clojure.lang.Var)RT.var("clojure.core", "zipmap");
  const__32 = (clojure.lang.Var)RT.var("clojure.core", "ctor-sigs");
  const__33 = (java.lang.Object)Character.valueOf((char)45);
  const__34 = (java.lang.Object)Character.valueOf((char)95);
  const__35 = (java.lang.Object)java.lang.Class.class;
  const__36 = (java.lang.Object)clojure.lang.RT.class;
  const__37 = (java.lang.Object)clojure.lang.Var.class;
  const__38 = (java.lang.Object)clojure.lang.IFn.class;
  const__39 = (java.lang.Object)clojure.lang.ISeq.class;
  const__40 = (java.lang.Object)java.lang.UnsupportedOperationException.class;
  const__41 = (clojure.lang.Var)RT.var("clojure.core", "distinct");
  const__42 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__43 = (clojure.lang.Var)RT.var("clojure.core", "mapcat");
  const__44 = (clojure.lang.Var)RT.var("clojure.core", "non-private-methods");
  const__45 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__46 = (clojure.lang.Var)RT.var("clojure.core", "merge-with");
  const__47 = (clojure.lang.Var)RT.var("clojure.core", "into1");
  const__48 = (clojure.lang.Var)RT.var("clojure.core", "filter");
  const__49 = (clojure.lang.Var)RT.var("clojure.core", "keys");
  const__50 = (clojure.lang.Var)RT.var("clojure.core", "comp");
  const__51 = (clojure.lang.Var)RT.var("clojure.core", "partial");
  const__52 = (clojure.lang.Var)RT.var("clojure.core", "vals");
  const__53 = (clojure.lang.Var)RT.var("clojure.core", "val");
  const__54 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__55 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__56 = (clojure.lang.Var)RT.var("clojure.core", "*source-writer*");
  const__57 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__58 = (clojure.lang.Var)RT.var("clojure.core", "into-array");
  const__59 = (clojure.lang.Var)RT.var("clojure.core", "add-annotations");
  const__60 = (clojure.lang.Var)RT.var("clojure.core", "empty?");
  const__61 = (clojure.lang.Var)RT.var("clojure.core", "interpose");
  const__62 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__63 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__64 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__65 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__66 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__67 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__68 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__69 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__70 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__71 = (clojure.lang.IPersistentStack)RT.vector(java.lang.Object.class);
  const__72 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__73 = (java.lang.Object)1L;
  const__74 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__75 = (clojure.lang.Var)RT.var("clojure.core", "range");
  const__76 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__77 = (java.lang.Object)2L;
  const__78 = (clojure.lang.Keyword)Keyword.intern(null, "static");
  const__79 = (clojure.lang.Var)RT.var("clojure.core", "protected-final-methods");
  const__80 = (clojure.lang.Keyword)Keyword.intern(null, "get");
  const__81 = (clojure.lang.Keyword)Keyword.intern(null, "set");
  const__82 = (clojure.lang.Var)RT.var("clojure.core", "find-field");
  const__83 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public core_generate_class() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object options_map1) {
  try {
   ((IFn)const__0.getRawRoot()).invoke(options_map1);
   {
    Object default_options2 = RT.mapUniqueKeys(const__1, "-", const__2, Boolean.TRUE, const__3, ((IFn)const__4.getRawRoot()).invoke(const__5.get()));
    Object map__55623 = ((IFn)const__6.getRawRoot()).invoke(default_options2, options_map1);
    Object __r3567;
    Object __r3568 = ((IFn)const__7.getRawRoot()).invoke(map__55623);
    if (__r3568 != null && !(__r3568 == Boolean.FALSE)) {
     __r3567 = ((clojure.lang.PersistentHashMap)clojure.lang.PersistentHashMap.create((clojure.lang.ISeq)((clojure.lang.ISeq)((IFn)const__8.getRawRoot()).invoke(map__55623))));
    } else {
     __r3567 = map__55623;
    }
    Object map__55624 = __r3567;
    Object extends5 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__55624), ((java.lang.Object)const__10)));
    Object load_impl_ns6 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__55624), ((java.lang.Object)const__2)));
    Object exposes_methods7 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__55624), ((java.lang.Object)const__11)));
    Object exposes8 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__55624), ((java.lang.Object)const__12)));
    Object state9 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__55624), ((java.lang.Object)const__13)));
    Object init10 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__55624), ((java.lang.Object)const__14)));
    Object prefix11 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__55624), ((java.lang.Object)const__1)));
    Object impl_ns12 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__55624), ((java.lang.Object)const__3)));
    Object name13 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__55624), ((java.lang.Object)const__15)));
    Object factory14 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__55624), ((java.lang.Object)const__16)));
    Object implements15 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__55624), ((java.lang.Object)const__17)));
    Object methods16 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__55624), ((java.lang.Object)const__18)));
    Object post_init17 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__55624), ((java.lang.Object)const__19)));
    Object main18 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__55624), ((java.lang.Object)const__20)));
    Object constructors19 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__55624), ((java.lang.Object)const__21)));
    Object name_meta20 = ((IFn)const__22.getRawRoot()).invoke(name13);
    Object name21 = ((IFn)const__23.getRawRoot()).invoke(name13);
    Object package_name22 = ((IFn)const__24.getRawRoot()).invoke(name21, const__25, Integer.valueOf(((java.lang.String)name21).lastIndexOf((java.lang.String)((java.lang.String)"."))));
    Object class_name23 = ((IFn)const__24.getRawRoot()).invoke(name21, Numbers.num(clojure.lang.Numbers.inc((long)((java.lang.String)name21).lastIndexOf((java.lang.String)((java.lang.String)".")))));
    Object __r3569;
    Object __r3570 = extends5;
    if (__r3570 != null && !(__r3570 == Boolean.FALSE)) {
     __r3569 = ((IFn)const__27.getRawRoot()).invoke(extends5);
    } else {
     __r3569 = const__28;
    }
    Object super24 = __r3569;
    Object interfaces25 = ((IFn)const__29.getRawRoot()).invoke(const__27.getRawRoot(), implements15);
    Object supers26 = ((IFn)const__30.getRawRoot()).invoke(super24, interfaces25);
    Object __r3571 = null;
    {
     Object or__3968__auto__27 = constructors19;
     Object __r3572;
     Object __r3573 = or__3968__auto__27;
     if (__r3573 != null && !(__r3573 == Boolean.FALSE)) {
      __r3572 = or__3968__auto__27;
     } else {
      __r3572 = ((IFn)const__31.getRawRoot()).invoke(((IFn)const__32.getRawRoot()).invoke(super24), ((IFn)const__32.getRawRoot()).invoke(super24));
     }
     __r3571 = __r3572;
    }
    Object ctor_sig_map28 = __r3571;
    Object cv29 = new clojure.asm.ClassWriter((int)clojure.asm.ClassWriter.COMPUTE_MAXS);
    Object cname30 = ((java.lang.String)((java.lang.String)name21).replace((java.lang.CharSequence)((java.lang.CharSequence)"."), (java.lang.CharSequence)((java.lang.CharSequence)"/")));
    Object pkg_name31 = name21;
    Object impl_pkg_name32 = ((IFn)const__23.getRawRoot()).invoke(impl_ns12);
    Object impl_cname33 = ((java.lang.String)((java.lang.String)((java.lang.String)((java.lang.String)impl_pkg_name32).replace((java.lang.CharSequence)((java.lang.CharSequence)"."), (java.lang.CharSequence)((java.lang.CharSequence)"/")))).replace((char)((Character)const__33).charValue(), (char)((Character)const__34).charValue()));
    Object ctype34 = ((clojure.asm.Type)clojure.asm.Type.getObjectType((java.lang.String)((java.lang.String)cname30)));
    Object iname35 = new clojure.core_generate_class_iname__5563();
    Object totype36 = new clojure.core_generate_class_totype__5565();
    Object to_types37 = new clojure.core_generate_class_to_types__5567(totype36);
    Object obj_type38 = ((IFn)totype36).invoke(const__28);
    Object arg_types39 = new clojure.core_generate_class_arg_types__5569(obj_type38);
    Object super_type40 = ((IFn)totype36).invoke(super24);
    Object init_name41 = ((IFn)const__23.getRawRoot()).invoke(init10);
    Object post_init_name42 = ((IFn)const__23.getRawRoot()).invoke(post_init17);
    Object factory_name43 = ((IFn)const__23.getRawRoot()).invoke(factory14);
    Object state_name44 = ((IFn)const__23.getRawRoot()).invoke(state9);
    Object main_name45 = "main";
    Object var_name46 = new clojure.core_generate_class_var_name__5571();
    Object class_type47 = ((IFn)totype36).invoke(const__35);
    Object rt_type48 = ((IFn)totype36).invoke(const__36);
    Object var_type49 = ((IFn)totype36).invoke(const__37);
    Object ifn_type50 = ((IFn)totype36).invoke(const__38);
    Object iseq_type51 = ((IFn)totype36).invoke(const__39);
    Object ex_type52 = ((IFn)totype36).invoke(const__40);
    Object all_sigs53 = ((IFn)const__41.getRawRoot()).invoke(((IFn)const__42.getRawRoot()).invoke(((IFn)const__29.getRawRoot()).invoke(new clojure.core_generate_class_fn__5573(), ((IFn)const__43.getRawRoot()).invoke(const__44.getRawRoot(), supers26)), ((IFn)const__29.getRawRoot()).invoke(new clojure.core_generate_class_fn__5577(), methods16)));
    Object sigs_by_name54 = ((IFn)const__45.getRawRoot()).invoke(const__46.getRawRoot(), const__42.getRawRoot(), clojure.lang.PersistentArrayMap.EMPTY, all_sigs53);
    Object overloads55 = ((IFn)const__47.getRawRoot()).invoke(clojure.lang.PersistentArrayMap.EMPTY, ((IFn)const__48.getRawRoot()).invoke(new clojure.core_generate_class_fn__5581(), sigs_by_name54));
    Object __r3574;
    Object __r3575 = init10;
    if (__r3575 != null && !(__r3575 == Boolean.FALSE)) {
     __r3574 = RT.vector(init_name41);
    } else {
     __r3574 = null;
    }
    Object __r3576;
    Object __r3577 = post_init17;
    if (__r3577 != null && !(__r3577 == Boolean.FALSE)) {
     __r3576 = RT.vector(post_init_name42);
    } else {
     __r3576 = null;
    }
    Object __r3578;
    Object __r3579 = main18;
    if (__r3579 != null && !(__r3579 == Boolean.FALSE)) {
     __r3578 = RT.vector(main_name45);
    } else {
     __r3578 = null;
    }
    Object var_fields56 = ((IFn)const__42.getRawRoot()).invoke(__r3574, __r3576, __r3578, ((IFn)const__41.getRawRoot()).invoke(((IFn)const__42.getRawRoot()).invoke(((IFn)const__49.getRawRoot()).invoke(sigs_by_name54), ((IFn)const__43.getRawRoot()).invoke(new clojure.core_generate_class_fn__5585(), overloads55), ((IFn)const__43.getRawRoot()).invoke(((IFn)const__50.getRawRoot()).invoke(((IFn)const__51.getRawRoot()).invoke(const__29.getRawRoot(), const__23.getRawRoot()), const__52.getRawRoot(), const__53.getRawRoot()), exposes8))));
    Object emit_get_var57 = new clojure.core_generate_class_emit_get_var__5590(ctype34, var_name46, var_type49);
    Object emit_unsupported58 = new clojure.core_generate_class_emit_unsupported__5592(impl_pkg_name32, prefix11, ex_type52);
    Object emit_forwarding_method59 = new clojure.core_generate_class_emit_forwarding_method__5594(ifn_type50, totype36, to_types37, emit_get_var57, cv29, obj_type38, overloads55);
    {
     ((IFn)const__54.getRawRoot()).invoke(((IFn)const__55.getRawRoot()).invoke(const__56, ((clojure.lang.SourceWriter)((clojure.asm.ClassWriter)cv29).getSc())));
     try {
      clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("package ", package_name22, ";")));
      clojure.lang.Compiler.emitSource();
      clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("import clojure.lang.*;")));
      clojure.lang.Compiler.emitSource();
      Object __r3580 = null;
      {
       Object temp__4117__auto__62 = ((IFn)const__8.getRawRoot()).invoke(interfaces25);
       Object __r3581;
       Object __r3582 = temp__4117__auto__62;
       if (__r3582 != null && !(__r3582 == Boolean.FALSE)) {
        Object __r3583 = null;
        {
         Object ifc63 = temp__4117__auto__62;
         __r3583 = ((IFn)const__58.getRawRoot()).invoke(((IFn)const__29.getRawRoot()).invoke(iname35, ifc63));
        }
        __r3581 = __r3583;
       } else {
        __r3581 = null;
       }
       __r3580 = __r3581;
      }
      ((clojure.asm.ClassWriter)cv29).visit((int)clojure.asm.Opcodes.V1_5, (int)RT.intCast(clojure.lang.Numbers.add((long)clojure.asm.Opcodes.ACC_PUBLIC, (long)clojure.asm.Opcodes.ACC_SUPER)), (java.lang.String)((java.lang.String)cname30), (java.lang.String)((java.lang.String)null), (java.lang.String)((java.lang.String)((IFn)iname35).invoke(super24)), (java.lang.String[])((java.lang.String[])__r3580));
      ((IFn)const__59.getRawRoot()).invoke(cv29, name_meta20);
      Object __r3584;
      Object __r3585 = ((IFn)const__60.getRawRoot()).invoke(interfaces25);
      if (__r3585 != null && !(__r3585 == Boolean.FALSE)) {
       __r3584 = "";
      } else {
       __r3584 = ((IFn)const__23.getRawRoot()).invoke(" implements ", ((IFn)const__45.getRawRoot()).invoke(const__23.getRawRoot(), ((IFn)const__61.getRawRoot()).invoke(", ", ((IFn)const__29.getRawRoot()).invoke(new clojure.core_generate_class_fn__5603(), interfaces25))));
      }
      clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("public class ", class_name23, " extends ", ((java.lang.String)clojure.lang.Compiler.printClass(((java.lang.Object)super24))), __r3584, " {")));
      clojure.lang.Compiler.tab();
      {
       Object seq_560564 = ((IFn)const__8.getRawRoot()).invoke(var_fields56);
       Object chunk_560665 = null;
       long count_560766 = 0L;
       long i_560867 = 0L;
       while(true) {
        if (clojure.lang.Numbers.lt((long)i_560867, (long)count_560766)) {
         {
          Object v68 = ((java.lang.Object)((clojure.lang.Indexed)chunk_560665).nth((int)RT.intCast(i_560867)));
          ((clojure.asm.ClassWriter)cv29).visitField((int)RT.intCast(clojure.lang.Numbers.add((long)clojure.lang.Numbers.add((long)clojure.asm.Opcodes.ACC_PRIVATE, (long)clojure.asm.Opcodes.ACC_FINAL), (long)clojure.asm.Opcodes.ACC_STATIC)), (java.lang.String)((java.lang.String)((IFn)var_name46).invoke(v68)), (java.lang.String)((java.lang.String)((java.lang.String)((clojure.asm.Type)var_type49).getDescriptor())), (java.lang.String)((java.lang.String)null), ((java.lang.Object)null));
          clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("private final static Var ", ((IFn)var_name46).invoke(v68), ";")));
          long i_560867___aux = clojure.lang.Numbers.unchecked_inc((long)i_560867);
          i_560867 = i_560867___aux;
          continue;
         }
        } else {
         {
          Object temp__4117__auto__69 = ((IFn)const__8.getRawRoot()).invoke(seq_560564);
          Object __r3588 = temp__4117__auto__69;
          if (__r3588 != null && !(__r3588 == Boolean.FALSE)) {
           {
            Object seq_560570 = temp__4117__auto__69;
            Object __r3590 = ((IFn)const__64.getRawRoot()).invoke(seq_560570);
            if (__r3590 != null && !(__r3590 == Boolean.FALSE)) {
             {
              Object c__4343__auto__71 = ((IFn)const__65.getRawRoot()).invoke(seq_560570);
              java.lang.Object seq_560564___aux = ((IFn)const__66.getRawRoot()).invoke(seq_560570);
              java.lang.Object chunk_560665___aux = c__4343__auto__71;
              long count_560766___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__71)));
              long i_560867___aux = clojure.lang.RT.intCast((long)0L);
              seq_560564 = seq_560564___aux;
              chunk_560665 = chunk_560665___aux;
              count_560766 = count_560766___aux;
              i_560867 = i_560867___aux;
              continue;
             }
            } else {
             {
              Object v72 = ((IFn)const__69.getRawRoot()).invoke(seq_560570);
              ((clojure.asm.ClassWriter)cv29).visitField((int)RT.intCast(clojure.lang.Numbers.add((long)clojure.lang.Numbers.add((long)clojure.asm.Opcodes.ACC_PRIVATE, (long)clojure.asm.Opcodes.ACC_FINAL), (long)clojure.asm.Opcodes.ACC_STATIC)), (java.lang.String)((java.lang.String)((IFn)var_name46).invoke(v72)), (java.lang.String)((java.lang.String)((java.lang.String)((clojure.asm.Type)var_type49).getDescriptor())), (java.lang.String)((java.lang.String)null), ((java.lang.Object)null));
              clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("private final static Var ", ((IFn)var_name46).invoke(v72), ";")));
              java.lang.Object seq_560564___aux = ((IFn)const__70.getRawRoot()).invoke(seq_560570);
              java.lang.Object chunk_560665___aux = null;
              long count_560766___aux = 0L;
              long i_560867___aux = 0L;
              seq_560564 = seq_560564___aux;
              chunk_560665 = chunk_560665___aux;
              count_560766 = count_560766___aux;
              i_560867 = i_560867___aux;
              continue;
             }
            }
           }
          } else {
          }
         }
        }
        break;
       }
      }
      Object __r3592 = state9;
      if (__r3592 != null && !(__r3592 == Boolean.FALSE)) {
       ((clojure.asm.ClassWriter)cv29).visitField((int)RT.intCast(clojure.lang.Numbers.add((long)clojure.asm.Opcodes.ACC_PUBLIC, (long)clojure.asm.Opcodes.ACC_FINAL)), (java.lang.String)((java.lang.String)state_name44), (java.lang.String)((java.lang.String)((java.lang.String)((clojure.asm.Type)obj_type38).getDescriptor())), (java.lang.String)((java.lang.String)null), ((java.lang.Object)null));
       clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("public final Object ", state_name44, ";")));
      } else {
      }
      {
       Object gen73 = new clojure.asm.commons.GeneratorAdapter((int)RT.intCast(clojure.lang.Numbers.add((long)clojure.asm.Opcodes.ACC_PUBLIC, (long)clojure.asm.Opcodes.ACC_STATIC)), (clojure.asm.commons.Method)((clojure.asm.commons.Method)((clojure.asm.commons.Method)clojure.asm.commons.Method.getMethod((java.lang.String)((java.lang.String)"void <clinit> ()")))), (java.lang.String)((java.lang.String)null), (clojure.asm.Type[])((clojure.asm.Type[])null), (clojure.asm.ClassVisitor)((clojure.asm.ClassVisitor)cv29));
       clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"static {"));
       clojure.lang.Compiler.tab();
       ((clojure.asm.MethodAdapter)gen73).visitCode();
       {
        Object seq_560974 = ((IFn)const__8.getRawRoot()).invoke(var_fields56);
        Object chunk_561075 = null;
        long count_561176 = 0L;
        long i_561277 = 0L;
        while(true) {
         if (clojure.lang.Numbers.lt((long)i_561277, (long)count_561176)) {
          {
           Object v78 = ((java.lang.Object)((clojure.lang.Indexed)chunk_561075).nth((int)RT.intCast(i_561277)));
           ((clojure.asm.commons.GeneratorAdapter)gen73).push((java.lang.String)((java.lang.String)impl_pkg_name32));
           ((clojure.asm.commons.GeneratorAdapter)gen73).push((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(prefix11, v78)));
           ((clojure.asm.commons.GeneratorAdapter)gen73).invokeStatic((clojure.asm.Type)((clojure.asm.Type)var_type49), (clojure.asm.commons.Method)((clojure.asm.commons.Method)((clojure.asm.commons.Method)clojure.asm.commons.Method.getMethod((java.lang.String)((java.lang.String)"clojure.lang.Var internPrivate(String,String)")))));
           ((clojure.asm.commons.GeneratorAdapter)gen73).putStatic((clojure.asm.Type)((clojure.asm.Type)ctype34), (java.lang.String)((java.lang.String)((IFn)var_name46).invoke(v78)), (clojure.asm.Type)((clojure.asm.Type)var_type49));
           clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(((IFn)var_name46).invoke(v78), " = Var.internPrivate(\"", impl_pkg_name32, "\", \"", ((IFn)const__23.getRawRoot()).invoke(prefix11, v78), "\");")));
           long i_561277___aux = clojure.lang.Numbers.unchecked_inc((long)i_561277);
           i_561277 = i_561277___aux;
           continue;
          }
         } else {
          {
           Object temp__4117__auto__79 = ((IFn)const__8.getRawRoot()).invoke(seq_560974);
           Object __r3595 = temp__4117__auto__79;
           if (__r3595 != null && !(__r3595 == Boolean.FALSE)) {
            {
             Object seq_560980 = temp__4117__auto__79;
             Object __r3597 = ((IFn)const__64.getRawRoot()).invoke(seq_560980);
             if (__r3597 != null && !(__r3597 == Boolean.FALSE)) {
              {
               Object c__4343__auto__81 = ((IFn)const__65.getRawRoot()).invoke(seq_560980);
               java.lang.Object seq_560974___aux = ((IFn)const__66.getRawRoot()).invoke(seq_560980);
               java.lang.Object chunk_561075___aux = c__4343__auto__81;
               long count_561176___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__81)));
               long i_561277___aux = clojure.lang.RT.intCast((long)0L);
               seq_560974 = seq_560974___aux;
               chunk_561075 = chunk_561075___aux;
               count_561176 = count_561176___aux;
               i_561277 = i_561277___aux;
               continue;
              }
             } else {
              {
               Object v82 = ((IFn)const__69.getRawRoot()).invoke(seq_560980);
               ((clojure.asm.commons.GeneratorAdapter)gen73).push((java.lang.String)((java.lang.String)impl_pkg_name32));
               ((clojure.asm.commons.GeneratorAdapter)gen73).push((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(prefix11, v82)));
               ((clojure.asm.commons.GeneratorAdapter)gen73).invokeStatic((clojure.asm.Type)((clojure.asm.Type)var_type49), (clojure.asm.commons.Method)((clojure.asm.commons.Method)((clojure.asm.commons.Method)clojure.asm.commons.Method.getMethod((java.lang.String)((java.lang.String)"clojure.lang.Var internPrivate(String,String)")))));
               ((clojure.asm.commons.GeneratorAdapter)gen73).putStatic((clojure.asm.Type)((clojure.asm.Type)ctype34), (java.lang.String)((java.lang.String)((IFn)var_name46).invoke(v82)), (clojure.asm.Type)((clojure.asm.Type)var_type49));
               clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(((IFn)var_name46).invoke(v82), " = Var.internPrivate(\"", impl_pkg_name32, "\", \"", ((IFn)const__23.getRawRoot()).invoke(prefix11, v82), "\");")));
               java.lang.Object seq_560974___aux = ((IFn)const__70.getRawRoot()).invoke(seq_560980);
               java.lang.Object chunk_561075___aux = null;
               long count_561176___aux = 0L;
               long i_561277___aux = 0L;
               seq_560974 = seq_560974___aux;
               chunk_561075 = chunk_561075___aux;
               count_561176 = count_561176___aux;
               i_561277 = i_561277___aux;
               continue;
              }
             }
            }
           } else {
           }
          }
         }
         break;
        }
       }
       Object __r3599 = load_impl_ns6;
       if (__r3599 != null && !(__r3599 == Boolean.FALSE)) {
        ((clojure.asm.commons.GeneratorAdapter)gen73).push((java.lang.String)((java.lang.String)"clojure.core"));
        ((clojure.asm.commons.GeneratorAdapter)gen73).push((java.lang.String)((java.lang.String)"load"));
        ((clojure.asm.commons.GeneratorAdapter)gen73).invokeStatic((clojure.asm.Type)((clojure.asm.Type)rt_type48), (clojure.asm.commons.Method)((clojure.asm.commons.Method)((clojure.asm.commons.Method)clojure.asm.commons.Method.getMethod((java.lang.String)((java.lang.String)"clojure.lang.Var var(String,String)")))));
        ((clojure.asm.commons.GeneratorAdapter)gen73).push((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("/", impl_cname33)));
        ((clojure.asm.commons.GeneratorAdapter)gen73).invokeInterface((clojure.asm.Type)((clojure.asm.Type)ifn_type50), (clojure.asm.commons.Method)((clojure.asm.commons.Method)new clojure.asm.commons.Method((java.lang.String)((java.lang.String)"invoke"), (clojure.asm.Type)((clojure.asm.Type)obj_type38), (clojure.asm.Type[])((clojure.asm.Type[])((IFn)to_types37).invoke(const__71)))));
        ((clojure.asm.commons.GeneratorAdapter)gen73).pop();
        clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("RT.var(\"clojure.core\", ", "\"load\").invoke(\"", ((IFn)const__23.getRawRoot()).invoke("/", impl_cname33), "\");")));
       } else {
       }
       clojure.lang.Compiler.untab();
       clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
       ((clojure.asm.commons.GeneratorAdapter)gen73).returnValue();
       ((clojure.asm.commons.GeneratorAdapter)gen73).endMethod();
      }
      {
       Object seq_561383 = ((IFn)const__8.getRawRoot()).invoke(ctor_sig_map28);
       Object chunk_561484 = null;
       long count_561585 = 0L;
       long i_561686 = 0L;
       while(true) {
        if (clojure.lang.Numbers.lt((long)i_561686, (long)count_561585)) {
         {
          Object vec__561787 = ((java.lang.Object)((clojure.lang.Indexed)chunk_561484).nth((int)RT.intCast(i_561686)));
          Object pclasses88 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__561787), (int)RT.intCast(0L), ((java.lang.Object)null)));
          Object super_pclasses89 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__561787), (int)RT.intCast(1L), ((java.lang.Object)null)));
          {
           Object constructor_annotations90 = ((IFn)const__22.getRawRoot()).invoke(pclasses88);
           Object pclasses91 = ((IFn)const__29.getRawRoot()).invoke(const__27.getRawRoot(), pclasses88);
           Object super_pclasses92 = ((IFn)const__29.getRawRoot()).invoke(const__27.getRawRoot(), super_pclasses89);
           Object ptypes93 = ((IFn)to_types37).invoke(pclasses91);
           Object super_ptypes94 = ((IFn)to_types37).invoke(super_pclasses92);
           Object m95 = new clojure.asm.commons.Method((java.lang.String)((java.lang.String)"<init>"), (clojure.asm.Type)((clojure.asm.Type)((clojure.asm.Type)clojure.asm.Type.VOID_TYPE)), (clojure.asm.Type[])((clojure.asm.Type[])ptypes93));
           Object super_m96 = new clojure.asm.commons.Method((java.lang.String)((java.lang.String)"<init>"), (clojure.asm.Type)((clojure.asm.Type)((clojure.asm.Type)clojure.asm.Type.VOID_TYPE)), (clojure.asm.Type[])((clojure.asm.Type[])super_ptypes94));
           Object gen97 = new clojure.asm.commons.GeneratorAdapter((int)clojure.asm.Opcodes.ACC_PUBLIC, (clojure.asm.commons.Method)((clojure.asm.commons.Method)m95), (java.lang.String)((java.lang.String)null), (clojure.asm.Type[])((clojure.asm.Type[])null), (clojure.asm.ClassVisitor)((clojure.asm.ClassVisitor)cv29));
           Object _98 = ((IFn)const__59.getRawRoot()).invoke(gen97, constructor_annotations90);
           Object no_init_label99 = ((clojure.asm.Label)((clojure.asm.commons.GeneratorAdapter)gen97).newLabel());
           Object end_label100 = ((clojure.asm.Label)((clojure.asm.commons.GeneratorAdapter)gen97).newLabel());
           Object no_post_init_label101 = ((clojure.asm.Label)((clojure.asm.commons.GeneratorAdapter)gen97).newLabel());
           Object end_post_init_label102 = ((clojure.asm.Label)((clojure.asm.commons.GeneratorAdapter)gen97).newLabel());
           Object nth_method103 = ((clojure.asm.commons.Method)clojure.asm.commons.Method.getMethod((java.lang.String)((java.lang.String)"Object nth(Object,int)")));
           int local104 = ((clojure.asm.commons.LocalVariablesSorter)gen97).newLocal((clojure.asm.Type)((clojure.asm.Type)obj_type38));
           ((clojure.asm.MethodAdapter)gen97).visitCode();
           clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("public ", class_name23, "(", ((IFn)const__74.getRawRoot()).invoke(const__23.getRawRoot(), ((IFn)const__61.getRawRoot()).invoke(", ", ((IFn)const__29.getRawRoot()).invoke(new clojure.core_generate_class_fn__5618(pclasses91), ((IFn)const__75.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses91))))))), ") {")));
           Object __r3602 = init10;
           if (__r3602 != null && !(__r3602 == Boolean.FALSE)) {
            clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"{"));
            clojure.lang.Compiler.tab();
            ((IFn)emit_get_var57).invoke(gen97, init_name41);
            ((clojure.asm.commons.GeneratorAdapter)gen97).dup();
            ((clojure.asm.commons.GeneratorAdapter)gen97).ifNull((clojure.asm.Label)((clojure.asm.Label)no_init_label99));
            clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"if (value != null) {"));
            clojure.lang.Compiler.tab();
            ((clojure.asm.commons.GeneratorAdapter)gen97).checkCast((clojure.asm.Type)((clojure.asm.Type)ifn_type50));
            clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("final Object found = RT.nth(((IFn)value).invoke(", ((IFn)const__74.getRawRoot()).invoke(const__23.getRawRoot(), ((IFn)const__61.getRawRoot()).invoke(", ", ((IFn)const__29.getRawRoot()).invoke(new clojure.core_generate_class_fn__5620(pclasses91, gen97), ((IFn)const__75.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses91))))))), "), 0);")));
            ((clojure.asm.commons.GeneratorAdapter)gen97).invokeInterface((clojure.asm.Type)((clojure.asm.Type)ifn_type50), (clojure.asm.commons.Method)((clojure.asm.commons.Method)new clojure.asm.commons.Method((java.lang.String)((java.lang.String)"invoke"), (clojure.asm.Type)((clojure.asm.Type)obj_type38), (clojure.asm.Type[])((clojure.asm.Type[])((IFn)arg_types39).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)ptypes93))))))));
            ((clojure.asm.commons.GeneratorAdapter)gen97).dup();
            ((clojure.asm.commons.GeneratorAdapter)gen97).push((int)clojure.lang.RT.intCast((long)0L));
            ((clojure.asm.commons.GeneratorAdapter)gen97).invokeStatic((clojure.asm.Type)((clojure.asm.Type)rt_type48), (clojure.asm.commons.Method)((clojure.asm.commons.Method)nth_method103));
            ((clojure.asm.commons.GeneratorAdapter)gen97).storeLocal((int)local104);
            ((clojure.asm.commons.GeneratorAdapter)gen97).loadThis();
            ((clojure.asm.commons.GeneratorAdapter)gen97).dupX1();
            clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("super(", ((IFn)const__74.getRawRoot()).invoke(const__23.getRawRoot(), ((IFn)const__61.getRawRoot()).invoke(", ", ((IFn)const__29.getRawRoot()).invoke(new clojure.core_generate_class_fn__5622(super_pclasses92, rt_type48, local104, nth_method103, gen97), ((IFn)const__75.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)super_pclasses92))))))), ");")));
            ((clojure.asm.commons.GeneratorAdapter)gen97).invokeConstructor((clojure.asm.Type)((clojure.asm.Type)super_type40), (clojure.asm.commons.Method)((clojure.asm.commons.Method)super_m96));
            Object __r3604 = state9;
            if (__r3604 != null && !(__r3604 == Boolean.FALSE)) {
             clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(state_name44, " = RT.nth(", "found", ", 1);")));
             ((clojure.asm.commons.GeneratorAdapter)gen97).push((int)clojure.lang.RT.intCast((long)1L));
             ((clojure.asm.commons.GeneratorAdapter)gen97).invokeStatic((clojure.asm.Type)((clojure.asm.Type)rt_type48), (clojure.asm.commons.Method)((clojure.asm.commons.Method)nth_method103));
             ((clojure.asm.commons.GeneratorAdapter)gen97).putField((clojure.asm.Type)((clojure.asm.Type)ctype34), (java.lang.String)((java.lang.String)state_name44), (clojure.asm.Type)((clojure.asm.Type)obj_type38));
            } else {
             ((clojure.asm.commons.GeneratorAdapter)gen97).pop();
            }
            ((clojure.asm.commons.GeneratorAdapter)gen97).goTo((clojure.asm.Label)((clojure.asm.Label)end_label100));
            clojure.lang.Compiler.untab();
            clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"} else {"));
            clojure.lang.Compiler.tab();
            ((clojure.asm.commons.GeneratorAdapter)gen97).mark((clojure.asm.Label)((clojure.asm.Label)no_init_label99));
            {
             Object msg105 = ((IFn)const__23.getRawRoot()).invoke(impl_pkg_name32, "/", prefix11, init_name41, " not defined");
             ((clojure.asm.commons.GeneratorAdapter)gen97).throwException((clojure.asm.Type)((clojure.asm.Type)ex_type52), (java.lang.String)((java.lang.String)msg105));
             clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("throw new ", ((java.lang.String)clojure.lang.Compiler.printClass(((java.lang.Object)ex_type52))), "(\"", msg105, "\");")));
            }
            ((clojure.asm.commons.GeneratorAdapter)gen97).mark((clojure.asm.Label)((clojure.asm.Label)end_label100));
            clojure.lang.Compiler.untab();
            clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
            clojure.lang.Compiler.untab();
            clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
           } else {
            if (clojure.lang.Util.equiv(((java.lang.Object)pclasses91), ((java.lang.Object)super_pclasses92))) {
             ((clojure.asm.commons.GeneratorAdapter)gen97).loadThis();
             ((clojure.asm.commons.GeneratorAdapter)gen97).loadArgs();
             ((clojure.asm.commons.GeneratorAdapter)gen97).invokeConstructor((clojure.asm.Type)((clojure.asm.Type)super_type40), (clojure.asm.commons.Method)((clojure.asm.commons.Method)super_m96));
             clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("super(", ((IFn)const__74.getRawRoot()).invoke(const__23.getRawRoot(), ((IFn)const__61.getRawRoot()).invoke(", ", ((IFn)const__29.getRawRoot()).invoke(new clojure.core_generate_class_fn__5624(), ((IFn)const__75.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses91))))))), ");")));
            } else {
             Util.trow((Throwable)new java.lang.Exception((java.lang.String)((java.lang.String)":init not specified, but ctor and super ctor args differ")));
            }
           }
           Object __r3607 = post_init17;
           if (__r3607 != null && !(__r3607 == Boolean.FALSE)) {
            clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"{"));
            clojure.lang.Compiler.tab();
            ((IFn)emit_get_var57).invoke(gen97, post_init_name42);
            ((clojure.asm.commons.GeneratorAdapter)gen97).dup();
            clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"if (value != null) {"));
            clojure.lang.Compiler.tab();
            ((clojure.asm.commons.GeneratorAdapter)gen97).ifNull((clojure.asm.Label)((clojure.asm.Label)no_post_init_label101));
            ((clojure.asm.commons.GeneratorAdapter)gen97).checkCast((clojure.asm.Type)((clojure.asm.Type)ifn_type50));
            ((clojure.asm.commons.GeneratorAdapter)gen97).loadThis();
            clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("((IFn)value).invoke(", ((IFn)const__74.getRawRoot()).invoke(const__23.getRawRoot(), ((IFn)const__61.getRawRoot()).invoke(", ", ((IFn)const__29.getRawRoot()).invoke(new clojure.core_generate_class_fn__5626(pclasses91, gen97), ((IFn)const__75.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses91))))))), ")")));
            ((clojure.asm.commons.GeneratorAdapter)gen97).invokeInterface((clojure.asm.Type)((clojure.asm.Type)ifn_type50), (clojure.asm.commons.Method)((clojure.asm.commons.Method)new clojure.asm.commons.Method((java.lang.String)((java.lang.String)"invoke"), (clojure.asm.Type)((clojure.asm.Type)obj_type38), (clojure.asm.Type[])((clojure.asm.Type[])((IFn)arg_types39).invoke(Numbers.num(clojure.lang.Numbers.inc((long)clojure.lang.RT.count(((java.lang.Object)ptypes93)))))))));
            ((clojure.asm.commons.GeneratorAdapter)gen97).pop();
            ((clojure.asm.commons.GeneratorAdapter)gen97).goTo((clojure.asm.Label)((clojure.asm.Label)end_post_init_label102));
            ((clojure.asm.commons.GeneratorAdapter)gen97).mark((clojure.asm.Label)((clojure.asm.Label)no_post_init_label101));
            clojure.lang.Compiler.untab();
            clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"} else {"));
            {
             Object msg106 = ((IFn)const__23.getRawRoot()).invoke(impl_pkg_name32, "/", prefix11, post_init_name42, " not defined");
             clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("throw new ", ((java.lang.String)clojure.lang.Compiler.printClass(((java.lang.Object)ex_type52))), "(\"", msg106, "\");")));
             ((clojure.asm.commons.GeneratorAdapter)gen97).throwException((clojure.asm.Type)((clojure.asm.Type)ex_type52), (java.lang.String)((java.lang.String)msg106));
            }
            clojure.lang.Compiler.untab();
            clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
            clojure.lang.Compiler.untab();
            clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
            ((clojure.asm.commons.GeneratorAdapter)gen97).mark((clojure.asm.Label)((clojure.asm.Label)end_post_init_label102));
           } else {
           }
           ((clojure.asm.commons.GeneratorAdapter)gen97).returnValue();
           ((clojure.asm.commons.GeneratorAdapter)gen97).endMethod();
           clojure.lang.Compiler.untab();
           clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
           Object __r3609 = factory14;
           if (__r3609 != null && !(__r3609 == Boolean.FALSE)) {
            {
             Object fm107 = new clojure.asm.commons.Method((java.lang.String)((java.lang.String)factory_name43), (clojure.asm.Type)((clojure.asm.Type)ctype34), (clojure.asm.Type[])((clojure.asm.Type[])ptypes93));
             Object gen108 = new clojure.asm.commons.GeneratorAdapter((int)RT.intCast(clojure.lang.Numbers.add((long)clojure.asm.Opcodes.ACC_PUBLIC, (long)clojure.asm.Opcodes.ACC_STATIC)), (clojure.asm.commons.Method)((clojure.asm.commons.Method)fm107), (java.lang.String)((java.lang.String)null), (clojure.asm.Type[])((clojure.asm.Type[])null), (clojure.asm.ClassVisitor)((clojure.asm.ClassVisitor)cv29));
             clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("public static ", ((java.lang.String)clojure.lang.Compiler.printClass(((java.lang.Object)ctype34))), " ", factory_name43, "(", ((IFn)const__74.getRawRoot()).invoke(const__23.getRawRoot(), ((IFn)const__61.getRawRoot()).invoke(", ", ((IFn)const__29.getRawRoot()).invoke(new clojure.core_generate_class_fn__5628(pclasses91), ((IFn)const__75.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses91))))))), ") {")));
             clojure.lang.Compiler.tab();
             ((clojure.asm.MethodAdapter)gen108).visitCode();
             ((clojure.asm.commons.GeneratorAdapter)gen108).newInstance((clojure.asm.Type)((clojure.asm.Type)ctype34));
             ((clojure.asm.commons.GeneratorAdapter)gen108).dup();
             ((clojure.asm.commons.GeneratorAdapter)gen108).loadArgs();
             ((clojure.asm.commons.GeneratorAdapter)gen108).invokeConstructor((clojure.asm.Type)((clojure.asm.Type)ctype34), (clojure.asm.commons.Method)((clojure.asm.commons.Method)m95));
             clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("return new ", ((java.lang.String)clojure.lang.Compiler.printClass(((java.lang.Object)ctype34))), "(", ((IFn)const__74.getRawRoot()).invoke(const__23.getRawRoot(), ((IFn)const__61.getRawRoot()).invoke(", ", ((IFn)const__29.getRawRoot()).invoke(new clojure.core_generate_class_fn__5630(), ((IFn)const__75.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses91))))))), ");")));
             clojure.lang.Compiler.untab();
             clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
             ((clojure.asm.commons.GeneratorAdapter)gen108).returnValue();
             ((clojure.asm.commons.GeneratorAdapter)gen108).endMethod();
            }
           } else {
           }
          }
          long i_561686___aux = clojure.lang.Numbers.unchecked_inc((long)i_561686);
          i_561686 = i_561686___aux;
          continue;
         }
        } else {
         {
          Object temp__4117__auto__109 = ((IFn)const__8.getRawRoot()).invoke(seq_561383);
          Object __r3611 = temp__4117__auto__109;
          if (__r3611 != null && !(__r3611 == Boolean.FALSE)) {
           {
            Object seq_5613110 = temp__4117__auto__109;
            Object __r3613 = ((IFn)const__64.getRawRoot()).invoke(seq_5613110);
            if (__r3613 != null && !(__r3613 == Boolean.FALSE)) {
             {
              Object c__4343__auto__111 = ((IFn)const__65.getRawRoot()).invoke(seq_5613110);
              java.lang.Object seq_561383___aux = ((IFn)const__66.getRawRoot()).invoke(seq_5613110);
              java.lang.Object chunk_561484___aux = c__4343__auto__111;
              long count_561585___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__111)));
              long i_561686___aux = clojure.lang.RT.intCast((long)0L);
              seq_561383 = seq_561383___aux;
              chunk_561484 = chunk_561484___aux;
              count_561585 = count_561585___aux;
              i_561686 = i_561686___aux;
              continue;
             }
            } else {
             {
              Object vec__5632112 = ((IFn)const__69.getRawRoot()).invoke(seq_5613110);
              Object pclasses113 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__5632112), (int)RT.intCast(0L), ((java.lang.Object)null)));
              Object super_pclasses114 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__5632112), (int)RT.intCast(1L), ((java.lang.Object)null)));
              {
               Object constructor_annotations115 = ((IFn)const__22.getRawRoot()).invoke(pclasses113);
               Object pclasses116 = ((IFn)const__29.getRawRoot()).invoke(const__27.getRawRoot(), pclasses113);
               Object super_pclasses117 = ((IFn)const__29.getRawRoot()).invoke(const__27.getRawRoot(), super_pclasses114);
               Object ptypes118 = ((IFn)to_types37).invoke(pclasses116);
               Object super_ptypes119 = ((IFn)to_types37).invoke(super_pclasses117);
               Object m120 = new clojure.asm.commons.Method((java.lang.String)((java.lang.String)"<init>"), (clojure.asm.Type)((clojure.asm.Type)((clojure.asm.Type)clojure.asm.Type.VOID_TYPE)), (clojure.asm.Type[])((clojure.asm.Type[])ptypes118));
               Object super_m121 = new clojure.asm.commons.Method((java.lang.String)((java.lang.String)"<init>"), (clojure.asm.Type)((clojure.asm.Type)((clojure.asm.Type)clojure.asm.Type.VOID_TYPE)), (clojure.asm.Type[])((clojure.asm.Type[])super_ptypes119));
               Object gen122 = new clojure.asm.commons.GeneratorAdapter((int)clojure.asm.Opcodes.ACC_PUBLIC, (clojure.asm.commons.Method)((clojure.asm.commons.Method)m120), (java.lang.String)((java.lang.String)null), (clojure.asm.Type[])((clojure.asm.Type[])null), (clojure.asm.ClassVisitor)((clojure.asm.ClassVisitor)cv29));
               Object _123 = ((IFn)const__59.getRawRoot()).invoke(gen122, constructor_annotations115);
               Object no_init_label124 = ((clojure.asm.Label)((clojure.asm.commons.GeneratorAdapter)gen122).newLabel());
               Object end_label125 = ((clojure.asm.Label)((clojure.asm.commons.GeneratorAdapter)gen122).newLabel());
               Object no_post_init_label126 = ((clojure.asm.Label)((clojure.asm.commons.GeneratorAdapter)gen122).newLabel());
               Object end_post_init_label127 = ((clojure.asm.Label)((clojure.asm.commons.GeneratorAdapter)gen122).newLabel());
               Object nth_method128 = ((clojure.asm.commons.Method)clojure.asm.commons.Method.getMethod((java.lang.String)((java.lang.String)"Object nth(Object,int)")));
               int local129 = ((clojure.asm.commons.LocalVariablesSorter)gen122).newLocal((clojure.asm.Type)((clojure.asm.Type)obj_type38));
               ((clojure.asm.MethodAdapter)gen122).visitCode();
               clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("public ", class_name23, "(", ((IFn)const__74.getRawRoot()).invoke(const__23.getRawRoot(), ((IFn)const__61.getRawRoot()).invoke(", ", ((IFn)const__29.getRawRoot()).invoke(new clojure.core_generate_class_fn__5633(pclasses116), ((IFn)const__75.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses116))))))), ") {")));
               Object __r3615 = init10;
               if (__r3615 != null && !(__r3615 == Boolean.FALSE)) {
                clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"{"));
                clojure.lang.Compiler.tab();
                ((IFn)emit_get_var57).invoke(gen122, init_name41);
                ((clojure.asm.commons.GeneratorAdapter)gen122).dup();
                ((clojure.asm.commons.GeneratorAdapter)gen122).ifNull((clojure.asm.Label)((clojure.asm.Label)no_init_label124));
                clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"if (value != null) {"));
                clojure.lang.Compiler.tab();
                ((clojure.asm.commons.GeneratorAdapter)gen122).checkCast((clojure.asm.Type)((clojure.asm.Type)ifn_type50));
                clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("final Object found = RT.nth(((IFn)value).invoke(", ((IFn)const__74.getRawRoot()).invoke(const__23.getRawRoot(), ((IFn)const__61.getRawRoot()).invoke(", ", ((IFn)const__29.getRawRoot()).invoke(new clojure.core_generate_class_fn__5635(pclasses116, gen122), ((IFn)const__75.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses116))))))), "), 0);")));
                ((clojure.asm.commons.GeneratorAdapter)gen122).invokeInterface((clojure.asm.Type)((clojure.asm.Type)ifn_type50), (clojure.asm.commons.Method)((clojure.asm.commons.Method)new clojure.asm.commons.Method((java.lang.String)((java.lang.String)"invoke"), (clojure.asm.Type)((clojure.asm.Type)obj_type38), (clojure.asm.Type[])((clojure.asm.Type[])((IFn)arg_types39).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)ptypes118))))))));
                ((clojure.asm.commons.GeneratorAdapter)gen122).dup();
                ((clojure.asm.commons.GeneratorAdapter)gen122).push((int)clojure.lang.RT.intCast((long)0L));
                ((clojure.asm.commons.GeneratorAdapter)gen122).invokeStatic((clojure.asm.Type)((clojure.asm.Type)rt_type48), (clojure.asm.commons.Method)((clojure.asm.commons.Method)nth_method128));
                ((clojure.asm.commons.GeneratorAdapter)gen122).storeLocal((int)local129);
                ((clojure.asm.commons.GeneratorAdapter)gen122).loadThis();
                ((clojure.asm.commons.GeneratorAdapter)gen122).dupX1();
                clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("super(", ((IFn)const__74.getRawRoot()).invoke(const__23.getRawRoot(), ((IFn)const__61.getRawRoot()).invoke(", ", ((IFn)const__29.getRawRoot()).invoke(new clojure.core_generate_class_fn__5637(nth_method128, rt_type48, gen122, local129, super_pclasses117), ((IFn)const__75.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)super_pclasses117))))))), ");")));
                ((clojure.asm.commons.GeneratorAdapter)gen122).invokeConstructor((clojure.asm.Type)((clojure.asm.Type)super_type40), (clojure.asm.commons.Method)((clojure.asm.commons.Method)super_m121));
                Object __r3617 = state9;
                if (__r3617 != null && !(__r3617 == Boolean.FALSE)) {
                 clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(state_name44, " = RT.nth(", "found", ", 1);")));
                 ((clojure.asm.commons.GeneratorAdapter)gen122).push((int)clojure.lang.RT.intCast((long)1L));
                 ((clojure.asm.commons.GeneratorAdapter)gen122).invokeStatic((clojure.asm.Type)((clojure.asm.Type)rt_type48), (clojure.asm.commons.Method)((clojure.asm.commons.Method)nth_method128));
                 ((clojure.asm.commons.GeneratorAdapter)gen122).putField((clojure.asm.Type)((clojure.asm.Type)ctype34), (java.lang.String)((java.lang.String)state_name44), (clojure.asm.Type)((clojure.asm.Type)obj_type38));
                } else {
                 ((clojure.asm.commons.GeneratorAdapter)gen122).pop();
                }
                ((clojure.asm.commons.GeneratorAdapter)gen122).goTo((clojure.asm.Label)((clojure.asm.Label)end_label125));
                clojure.lang.Compiler.untab();
                clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"} else {"));
                clojure.lang.Compiler.tab();
                ((clojure.asm.commons.GeneratorAdapter)gen122).mark((clojure.asm.Label)((clojure.asm.Label)no_init_label124));
                {
                 Object msg130 = ((IFn)const__23.getRawRoot()).invoke(impl_pkg_name32, "/", prefix11, init_name41, " not defined");
                 ((clojure.asm.commons.GeneratorAdapter)gen122).throwException((clojure.asm.Type)((clojure.asm.Type)ex_type52), (java.lang.String)((java.lang.String)msg130));
                 clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("throw new ", ((java.lang.String)clojure.lang.Compiler.printClass(((java.lang.Object)ex_type52))), "(\"", msg130, "\");")));
                }
                ((clojure.asm.commons.GeneratorAdapter)gen122).mark((clojure.asm.Label)((clojure.asm.Label)end_label125));
                clojure.lang.Compiler.untab();
                clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
                clojure.lang.Compiler.untab();
                clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
               } else {
                if (clojure.lang.Util.equiv(((java.lang.Object)pclasses116), ((java.lang.Object)super_pclasses117))) {
                 ((clojure.asm.commons.GeneratorAdapter)gen122).loadThis();
                 ((clojure.asm.commons.GeneratorAdapter)gen122).loadArgs();
                 ((clojure.asm.commons.GeneratorAdapter)gen122).invokeConstructor((clojure.asm.Type)((clojure.asm.Type)super_type40), (clojure.asm.commons.Method)((clojure.asm.commons.Method)super_m121));
                 clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("super(", ((IFn)const__74.getRawRoot()).invoke(const__23.getRawRoot(), ((IFn)const__61.getRawRoot()).invoke(", ", ((IFn)const__29.getRawRoot()).invoke(new clojure.core_generate_class_fn__5639(), ((IFn)const__75.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses116))))))), ");")));
                } else {
                 Util.trow((Throwable)new java.lang.Exception((java.lang.String)((java.lang.String)":init not specified, but ctor and super ctor args differ")));
                }
               }
               Object __r3620 = post_init17;
               if (__r3620 != null && !(__r3620 == Boolean.FALSE)) {
                clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"{"));
                clojure.lang.Compiler.tab();
                ((IFn)emit_get_var57).invoke(gen122, post_init_name42);
                ((clojure.asm.commons.GeneratorAdapter)gen122).dup();
                clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"if (value != null) {"));
                clojure.lang.Compiler.tab();
                ((clojure.asm.commons.GeneratorAdapter)gen122).ifNull((clojure.asm.Label)((clojure.asm.Label)no_post_init_label126));
                ((clojure.asm.commons.GeneratorAdapter)gen122).checkCast((clojure.asm.Type)((clojure.asm.Type)ifn_type50));
                ((clojure.asm.commons.GeneratorAdapter)gen122).loadThis();
                clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("((IFn)value).invoke(", ((IFn)const__74.getRawRoot()).invoke(const__23.getRawRoot(), ((IFn)const__61.getRawRoot()).invoke(", ", ((IFn)const__29.getRawRoot()).invoke(new clojure.core_generate_class_fn__5641(pclasses116, gen122), ((IFn)const__75.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses116))))))), ")")));
                ((clojure.asm.commons.GeneratorAdapter)gen122).invokeInterface((clojure.asm.Type)((clojure.asm.Type)ifn_type50), (clojure.asm.commons.Method)((clojure.asm.commons.Method)new clojure.asm.commons.Method((java.lang.String)((java.lang.String)"invoke"), (clojure.asm.Type)((clojure.asm.Type)obj_type38), (clojure.asm.Type[])((clojure.asm.Type[])((IFn)arg_types39).invoke(Numbers.num(clojure.lang.Numbers.inc((long)clojure.lang.RT.count(((java.lang.Object)ptypes118)))))))));
                ((clojure.asm.commons.GeneratorAdapter)gen122).pop();
                ((clojure.asm.commons.GeneratorAdapter)gen122).goTo((clojure.asm.Label)((clojure.asm.Label)end_post_init_label127));
                ((clojure.asm.commons.GeneratorAdapter)gen122).mark((clojure.asm.Label)((clojure.asm.Label)no_post_init_label126));
                clojure.lang.Compiler.untab();
                clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"} else {"));
                {
                 Object msg131 = ((IFn)const__23.getRawRoot()).invoke(impl_pkg_name32, "/", prefix11, post_init_name42, " not defined");
                 clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("throw new ", ((java.lang.String)clojure.lang.Compiler.printClass(((java.lang.Object)ex_type52))), "(\"", msg131, "\");")));
                 ((clojure.asm.commons.GeneratorAdapter)gen122).throwException((clojure.asm.Type)((clojure.asm.Type)ex_type52), (java.lang.String)((java.lang.String)msg131));
                }
                clojure.lang.Compiler.untab();
                clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
                clojure.lang.Compiler.untab();
                clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
                ((clojure.asm.commons.GeneratorAdapter)gen122).mark((clojure.asm.Label)((clojure.asm.Label)end_post_init_label127));
               } else {
               }
               ((clojure.asm.commons.GeneratorAdapter)gen122).returnValue();
               ((clojure.asm.commons.GeneratorAdapter)gen122).endMethod();
               clojure.lang.Compiler.untab();
               clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
               Object __r3622 = factory14;
               if (__r3622 != null && !(__r3622 == Boolean.FALSE)) {
                {
                 Object fm132 = new clojure.asm.commons.Method((java.lang.String)((java.lang.String)factory_name43), (clojure.asm.Type)((clojure.asm.Type)ctype34), (clojure.asm.Type[])((clojure.asm.Type[])ptypes118));
                 Object gen133 = new clojure.asm.commons.GeneratorAdapter((int)RT.intCast(clojure.lang.Numbers.add((long)clojure.asm.Opcodes.ACC_PUBLIC, (long)clojure.asm.Opcodes.ACC_STATIC)), (clojure.asm.commons.Method)((clojure.asm.commons.Method)fm132), (java.lang.String)((java.lang.String)null), (clojure.asm.Type[])((clojure.asm.Type[])null), (clojure.asm.ClassVisitor)((clojure.asm.ClassVisitor)cv29));
                 clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("public static ", ((java.lang.String)clojure.lang.Compiler.printClass(((java.lang.Object)ctype34))), " ", factory_name43, "(", ((IFn)const__74.getRawRoot()).invoke(const__23.getRawRoot(), ((IFn)const__61.getRawRoot()).invoke(", ", ((IFn)const__29.getRawRoot()).invoke(new clojure.core_generate_class_fn__5643(pclasses116), ((IFn)const__75.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses116))))))), ") {")));
                 clojure.lang.Compiler.tab();
                 ((clojure.asm.MethodAdapter)gen133).visitCode();
                 ((clojure.asm.commons.GeneratorAdapter)gen133).newInstance((clojure.asm.Type)((clojure.asm.Type)ctype34));
                 ((clojure.asm.commons.GeneratorAdapter)gen133).dup();
                 ((clojure.asm.commons.GeneratorAdapter)gen133).loadArgs();
                 ((clojure.asm.commons.GeneratorAdapter)gen133).invokeConstructor((clojure.asm.Type)((clojure.asm.Type)ctype34), (clojure.asm.commons.Method)((clojure.asm.commons.Method)m120));
                 clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("return new ", ((java.lang.String)clojure.lang.Compiler.printClass(((java.lang.Object)ctype34))), "(", ((IFn)const__74.getRawRoot()).invoke(const__23.getRawRoot(), ((IFn)const__61.getRawRoot()).invoke(", ", ((IFn)const__29.getRawRoot()).invoke(new clojure.core_generate_class_fn__5645(), ((IFn)const__75.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses116))))))), ");")));
                 clojure.lang.Compiler.untab();
                 clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
                 ((clojure.asm.commons.GeneratorAdapter)gen133).returnValue();
                 ((clojure.asm.commons.GeneratorAdapter)gen133).endMethod();
                }
               } else {
               }
              }
              java.lang.Object seq_561383___aux = ((IFn)const__70.getRawRoot()).invoke(seq_5613110);
              java.lang.Object chunk_561484___aux = null;
              long count_561585___aux = 0L;
              long i_561686___aux = 0L;
              seq_561383 = seq_561383___aux;
              chunk_561484 = chunk_561484___aux;
              count_561585 = count_561585___aux;
              i_561686 = i_561686___aux;
              continue;
             }
            }
           }
          } else {
          }
         }
        }
        break;
       }
      }
      {
       Object mm134 = ((IFn)const__44.getRawRoot()).invoke(super24);
       {
        Object seq_5647135 = ((IFn)const__8.getRawRoot()).invoke(((IFn)const__52.getRawRoot()).invoke(mm134));
        Object chunk_5648136 = null;
        long count_5649137 = 0L;
        long i_5650138 = 0L;
        while(true) {
         if (clojure.lang.Numbers.lt((long)i_5650138, (long)count_5649137)) {
          {
           Object meth139 = ((java.lang.Object)((clojure.lang.Indexed)chunk_5648136).nth((int)RT.intCast(i_5650138)));
           ((IFn)emit_forwarding_method59).invoke(((java.lang.String)((java.lang.reflect.Method)meth139).getName()), ((java.lang.Class[])((java.lang.reflect.Method)meth139).getParameterTypes()), ((java.lang.Class)((java.lang.reflect.Method)meth139).getReturnType()), ((java.lang.Class[])((java.lang.reflect.Method)meth139).getExceptionTypes()), Boolean.FALSE, new clojure.core_generate_class_fn__5651(super_type40, totype36, meth139));
           long i_5650138___aux = clojure.lang.Numbers.unchecked_inc((long)i_5650138);
           i_5650138 = i_5650138___aux;
           continue;
          }
         } else {
          {
           Object temp__4117__auto__140 = ((IFn)const__8.getRawRoot()).invoke(seq_5647135);
           Object __r3625 = temp__4117__auto__140;
           if (__r3625 != null && !(__r3625 == Boolean.FALSE)) {
            {
             Object seq_5647141 = temp__4117__auto__140;
             Object __r3627 = ((IFn)const__64.getRawRoot()).invoke(seq_5647141);
             if (__r3627 != null && !(__r3627 == Boolean.FALSE)) {
              {
               Object c__4343__auto__142 = ((IFn)const__65.getRawRoot()).invoke(seq_5647141);
               java.lang.Object seq_5647135___aux = ((IFn)const__66.getRawRoot()).invoke(seq_5647141);
               java.lang.Object chunk_5648136___aux = c__4343__auto__142;
               long count_5649137___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__142)));
               long i_5650138___aux = clojure.lang.RT.intCast((long)0L);
               seq_5647135 = seq_5647135___aux;
               chunk_5648136 = chunk_5648136___aux;
               count_5649137 = count_5649137___aux;
               i_5650138 = i_5650138___aux;
               continue;
              }
             } else {
              {
               Object meth143 = ((IFn)const__69.getRawRoot()).invoke(seq_5647141);
               ((IFn)emit_forwarding_method59).invoke(((java.lang.String)((java.lang.reflect.Method)meth143).getName()), ((java.lang.Class[])((java.lang.reflect.Method)meth143).getParameterTypes()), ((java.lang.Class)((java.lang.reflect.Method)meth143).getReturnType()), ((java.lang.Class[])((java.lang.reflect.Method)meth143).getExceptionTypes()), Boolean.FALSE, new clojure.core_generate_class_fn__5655(super_type40, totype36, meth143));
               java.lang.Object seq_5647135___aux = ((IFn)const__70.getRawRoot()).invoke(seq_5647141);
               java.lang.Object chunk_5648136___aux = null;
               long count_5649137___aux = 0L;
               long i_5650138___aux = 0L;
               seq_5647135 = seq_5647135___aux;
               chunk_5648136 = chunk_5648136___aux;
               count_5649137 = count_5649137___aux;
               i_5650138 = i_5650138___aux;
               continue;
              }
             }
            }
           } else {
           }
          }
         }
         break;
        }
       }
       ((IFn)const__74.getRawRoot()).invoke(new clojure.core_generate_class_fn__5659(emit_forwarding_method59, emit_unsupported58), mm134, ((IFn)const__43.getRawRoot()).invoke(new clojure.core_generate_class_fn__5661(), interfaces25));
       {
        Object seq_5663144 = ((IFn)const__8.getRawRoot()).invoke(methods16);
        Object chunk_5664145 = null;
        long count_5665146 = 0L;
        long i_5666147 = 0L;
        while(true) {
         if (clojure.lang.Numbers.lt((long)i_5666147, (long)count_5665146)) {
          {
           Object vec__5667148 = ((java.lang.Object)((clojure.lang.Indexed)chunk_5664145).nth((int)RT.intCast(i_5666147)));
           Object mname149 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__5667148), (int)RT.intCast(0L), ((java.lang.Object)null)));
           Object pclasses150 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__5667148), (int)RT.intCast(1L), ((java.lang.Object)null)));
           Object rclass151 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__5667148), (int)RT.intCast(2L), ((java.lang.Object)null)));
           Object msig152 = vec__5667148;
           ((IFn)emit_forwarding_method59).invoke(mname149, pclasses150, rclass151, null, RT.get(((IFn)const__22.getRawRoot()).invoke(msig152), Keyword.intern(null, "static")), emit_unsupported58);
           long i_5666147___aux = clojure.lang.Numbers.unchecked_inc((long)i_5666147);
           i_5666147 = i_5666147___aux;
           continue;
          }
         } else {
          {
           Object temp__4117__auto__153 = ((IFn)const__8.getRawRoot()).invoke(seq_5663144);
           Object __r3630 = temp__4117__auto__153;
           if (__r3630 != null && !(__r3630 == Boolean.FALSE)) {
            {
             Object seq_5663154 = temp__4117__auto__153;
             Object __r3632 = ((IFn)const__64.getRawRoot()).invoke(seq_5663154);
             if (__r3632 != null && !(__r3632 == Boolean.FALSE)) {
              {
               Object c__4343__auto__155 = ((IFn)const__65.getRawRoot()).invoke(seq_5663154);
               java.lang.Object seq_5663144___aux = ((IFn)const__66.getRawRoot()).invoke(seq_5663154);
               java.lang.Object chunk_5664145___aux = c__4343__auto__155;
               long count_5665146___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__155)));
               long i_5666147___aux = clojure.lang.RT.intCast((long)0L);
               seq_5663144 = seq_5663144___aux;
               chunk_5664145 = chunk_5664145___aux;
               count_5665146 = count_5665146___aux;
               i_5666147 = i_5666147___aux;
               continue;
              }
             } else {
              {
               Object vec__5668156 = ((IFn)const__69.getRawRoot()).invoke(seq_5663154);
               Object mname157 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__5668156), (int)RT.intCast(0L), ((java.lang.Object)null)));
               Object pclasses158 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__5668156), (int)RT.intCast(1L), ((java.lang.Object)null)));
               Object rclass159 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__5668156), (int)RT.intCast(2L), ((java.lang.Object)null)));
               Object msig160 = vec__5668156;
               ((IFn)emit_forwarding_method59).invoke(mname157, pclasses158, rclass159, null, RT.get(((IFn)const__22.getRawRoot()).invoke(msig160), Keyword.intern(null, "static")), emit_unsupported58);
               java.lang.Object seq_5663144___aux = ((IFn)const__70.getRawRoot()).invoke(seq_5663154);
               java.lang.Object chunk_5664145___aux = null;
               long count_5665146___aux = 0L;
               long i_5666147___aux = 0L;
               seq_5663144 = seq_5663144___aux;
               chunk_5664145 = chunk_5664145___aux;
               count_5665146 = count_5665146___aux;
               i_5666147 = i_5666147___aux;
               continue;
              }
             }
            }
           } else {
           }
          }
         }
         break;
        }
       }
       {
        Object seq_5669161 = ((IFn)const__8.getRawRoot()).invoke(((IFn)const__74.getRawRoot()).invoke(new clojure.core_generate_class_fn__5674(exposes_methods7), clojure.lang.PersistentVector.EMPTY, ((IFn)const__42.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(mm134), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__79.getRawRoot()).invoke(super24)))));
        Object chunk_5670162 = null;
        long count_5671163 = 0L;
        long i_5672164 = 0L;
        while(true) {
         if (clojure.lang.Numbers.lt((long)i_5672164, (long)count_5671163)) {
          {
           Object vec__5678165 = ((java.lang.Object)((clojure.lang.Indexed)chunk_5670162).nth((int)RT.intCast(i_5672164)));
           Object local_mname166 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__5678165), (int)RT.intCast(0L), ((java.lang.Object)null)));
           Object m167 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__5678165), (int)RT.intCast(1L), ((java.lang.Object)null)));
           {
            Object pclasses168 = ((java.lang.Class[])((java.lang.reflect.Method)m167).getParameterTypes());
            Object ptypes169 = ((IFn)to_types37).invoke(pclasses168);
            Object rtype170 = ((IFn)totype36).invoke(((java.lang.Class)((java.lang.reflect.Method)m167).getReturnType()));
            boolean rvoid171 = clojure.lang.Util.equiv(((java.lang.Object)Reflector.invokeInstanceMethod(rtype170, "getSort", new Object[]{})), (long)clojure.asm.Type.VOID);
            Object exposer_m172 = new clojure.asm.commons.Method((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(local_mname166)), (clojure.asm.Type)((clojure.asm.Type)rtype170), (clojure.asm.Type[])((clojure.asm.Type[])ptypes169));
            Object target_m173 = new clojure.asm.commons.Method((java.lang.String)((java.lang.String)((java.lang.String)((java.lang.reflect.Method)m167).getName())), (clojure.asm.Type)((clojure.asm.Type)rtype170), (clojure.asm.Type[])((clojure.asm.Type[])ptypes169));
            Object gen174 = new clojure.asm.commons.GeneratorAdapter((int)clojure.asm.Opcodes.ACC_PUBLIC, (clojure.asm.commons.Method)((clojure.asm.commons.Method)exposer_m172), (java.lang.String)((java.lang.String)null), (clojure.asm.Type[])((clojure.asm.Type[])null), (clojure.asm.ClassVisitor)((clojure.asm.ClassVisitor)cv29));
            clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("public ", ((java.lang.String)clojure.lang.Compiler.printClass(((java.lang.Object)rtype170))), " ", ((java.lang.String)((java.lang.reflect.Method)m167).getName()), "(", ((IFn)const__74.getRawRoot()).invoke(const__23.getRawRoot(), ((IFn)const__61.getRawRoot()).invoke(", ", ((IFn)const__29.getRawRoot()).invoke(new clojure.core_generate_class_fn__5679(pclasses168), ((IFn)const__75.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses168))))))), ") {")));
            clojure.lang.Compiler.tab();
            ((clojure.asm.commons.GeneratorAdapter)gen174).loadThis();
            ((clojure.asm.commons.GeneratorAdapter)gen174).loadArgs();
            ((clojure.asm.MethodAdapter)gen174).visitMethodInsn((int)clojure.asm.Opcodes.INVOKESPECIAL, (java.lang.String)((java.lang.String)((java.lang.String)((clojure.asm.Type)super_type40).getInternalName())), (java.lang.String)((java.lang.String)((java.lang.String)((clojure.asm.commons.Method)target_m173).getName())), (java.lang.String)((java.lang.String)((java.lang.String)((clojure.asm.commons.Method)target_m173).getDescriptor())));
            Object __r3634;
            if (rvoid171) {
             __r3634 = "";
            } else {
             __r3634 = "return ";
            }
            clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(__r3634, "super.", ((java.lang.String)((clojure.asm.commons.Method)target_m173).getName()), "(", ((IFn)const__74.getRawRoot()).invoke(const__23.getRawRoot(), ((IFn)const__61.getRawRoot()).invoke(", ", ((IFn)const__29.getRawRoot()).invoke(new clojure.core_generate_class_fn__5681(), ((IFn)const__75.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses168))))))), ");")));
            ((clojure.asm.commons.GeneratorAdapter)gen174).returnValue();
            clojure.lang.Compiler.untab();
            clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
            ((clojure.asm.commons.GeneratorAdapter)gen174).endMethod();
           }
           long i_5672164___aux = clojure.lang.Numbers.unchecked_inc((long)i_5672164);
           i_5672164 = i_5672164___aux;
           continue;
          }
         } else {
          {
           Object temp__4117__auto__175 = ((IFn)const__8.getRawRoot()).invoke(seq_5669161);
           Object __r3636 = temp__4117__auto__175;
           if (__r3636 != null && !(__r3636 == Boolean.FALSE)) {
            {
             Object seq_5669176 = temp__4117__auto__175;
             Object __r3638 = ((IFn)const__64.getRawRoot()).invoke(seq_5669176);
             if (__r3638 != null && !(__r3638 == Boolean.FALSE)) {
              {
               Object c__4343__auto__177 = ((IFn)const__65.getRawRoot()).invoke(seq_5669176);
               java.lang.Object seq_5669161___aux = ((IFn)const__66.getRawRoot()).invoke(seq_5669176);
               java.lang.Object chunk_5670162___aux = c__4343__auto__177;
               long count_5671163___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__177)));
               long i_5672164___aux = clojure.lang.RT.intCast((long)0L);
               seq_5669161 = seq_5669161___aux;
               chunk_5670162 = chunk_5670162___aux;
               count_5671163 = count_5671163___aux;
               i_5672164 = i_5672164___aux;
               continue;
              }
             } else {
              {
               Object vec__5683178 = ((IFn)const__69.getRawRoot()).invoke(seq_5669176);
               Object local_mname179 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__5683178), (int)RT.intCast(0L), ((java.lang.Object)null)));
               Object m180 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__5683178), (int)RT.intCast(1L), ((java.lang.Object)null)));
               {
                Object pclasses181 = ((java.lang.Class[])((java.lang.reflect.Method)m180).getParameterTypes());
                Object ptypes182 = ((IFn)to_types37).invoke(pclasses181);
                Object rtype183 = ((IFn)totype36).invoke(((java.lang.Class)((java.lang.reflect.Method)m180).getReturnType()));
                boolean rvoid184 = clojure.lang.Util.equiv(((java.lang.Object)Reflector.invokeInstanceMethod(rtype183, "getSort", new Object[]{})), (long)clojure.asm.Type.VOID);
                Object exposer_m185 = new clojure.asm.commons.Method((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(local_mname179)), (clojure.asm.Type)((clojure.asm.Type)rtype183), (clojure.asm.Type[])((clojure.asm.Type[])ptypes182));
                Object target_m186 = new clojure.asm.commons.Method((java.lang.String)((java.lang.String)((java.lang.String)((java.lang.reflect.Method)m180).getName())), (clojure.asm.Type)((clojure.asm.Type)rtype183), (clojure.asm.Type[])((clojure.asm.Type[])ptypes182));
                Object gen187 = new clojure.asm.commons.GeneratorAdapter((int)clojure.asm.Opcodes.ACC_PUBLIC, (clojure.asm.commons.Method)((clojure.asm.commons.Method)exposer_m185), (java.lang.String)((java.lang.String)null), (clojure.asm.Type[])((clojure.asm.Type[])null), (clojure.asm.ClassVisitor)((clojure.asm.ClassVisitor)cv29));
                clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("public ", ((java.lang.String)clojure.lang.Compiler.printClass(((java.lang.Object)rtype183))), " ", ((java.lang.String)((java.lang.reflect.Method)m180).getName()), "(", ((IFn)const__74.getRawRoot()).invoke(const__23.getRawRoot(), ((IFn)const__61.getRawRoot()).invoke(", ", ((IFn)const__29.getRawRoot()).invoke(new clojure.core_generate_class_fn__5684(pclasses181), ((IFn)const__75.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses181))))))), ") {")));
                clojure.lang.Compiler.tab();
                ((clojure.asm.commons.GeneratorAdapter)gen187).loadThis();
                ((clojure.asm.commons.GeneratorAdapter)gen187).loadArgs();
                ((clojure.asm.MethodAdapter)gen187).visitMethodInsn((int)clojure.asm.Opcodes.INVOKESPECIAL, (java.lang.String)((java.lang.String)((java.lang.String)((clojure.asm.Type)super_type40).getInternalName())), (java.lang.String)((java.lang.String)((java.lang.String)((clojure.asm.commons.Method)target_m186).getName())), (java.lang.String)((java.lang.String)((java.lang.String)((clojure.asm.commons.Method)target_m186).getDescriptor())));
                Object __r3639;
                if (rvoid184) {
                 __r3639 = "";
                } else {
                 __r3639 = "return ";
                }
                clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(__r3639, "super.", ((java.lang.String)((clojure.asm.commons.Method)target_m186).getName()), "(", ((IFn)const__74.getRawRoot()).invoke(const__23.getRawRoot(), ((IFn)const__61.getRawRoot()).invoke(", ", ((IFn)const__29.getRawRoot()).invoke(new clojure.core_generate_class_fn__5686(), ((IFn)const__75.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pclasses181))))))), ");")));
                ((clojure.asm.commons.GeneratorAdapter)gen187).returnValue();
                clojure.lang.Compiler.untab();
                clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
                ((clojure.asm.commons.GeneratorAdapter)gen187).endMethod();
               }
               java.lang.Object seq_5669161___aux = ((IFn)const__70.getRawRoot()).invoke(seq_5669176);
               java.lang.Object chunk_5670162___aux = null;
               long count_5671163___aux = 0L;
               long i_5672164___aux = 0L;
               seq_5669161 = seq_5669161___aux;
               chunk_5670162 = chunk_5670162___aux;
               count_5671163 = count_5671163___aux;
               i_5672164 = i_5672164___aux;
               continue;
              }
             }
            }
           } else {
           }
          }
         }
         break;
        }
       }
      }
      Object __r3641 = main18;
      if (__r3641 != null && !(__r3641 == Boolean.FALSE)) {
       {
        Object m188 = ((clojure.asm.commons.Method)clojure.asm.commons.Method.getMethod((java.lang.String)((java.lang.String)"void main (String[])")));
        Object gen189 = new clojure.asm.commons.GeneratorAdapter((int)RT.intCast(clojure.lang.Numbers.add((long)clojure.asm.Opcodes.ACC_PUBLIC, (long)clojure.asm.Opcodes.ACC_STATIC)), (clojure.asm.commons.Method)((clojure.asm.commons.Method)m188), (java.lang.String)((java.lang.String)null), (clojure.asm.Type[])((clojure.asm.Type[])null), (clojure.asm.ClassVisitor)((clojure.asm.ClassVisitor)cv29));
        Object no_main_label190 = ((clojure.asm.Label)((clojure.asm.commons.GeneratorAdapter)gen189).newLabel());
        Object end_label191 = ((clojure.asm.Label)((clojure.asm.commons.GeneratorAdapter)gen189).newLabel());
        ((clojure.asm.MethodAdapter)gen189).visitCode();
        clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("public static void main(String[] args) {")));
        clojure.lang.Compiler.tab();
        clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"Object value = null;"));
        ((IFn)emit_get_var57).invoke(gen189, main_name45);
        clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("if (value != null) {")));
        clojure.lang.Compiler.tab();
        clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("((IFn)value).applyTo(RT.seq(args));")));
        clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"return;"));
        clojure.lang.Compiler.untab();
        clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
        ((clojure.asm.commons.GeneratorAdapter)gen189).dup();
        ((clojure.asm.commons.GeneratorAdapter)gen189).ifNull((clojure.asm.Label)((clojure.asm.Label)no_main_label190));
        ((clojure.asm.commons.GeneratorAdapter)gen189).checkCast((clojure.asm.Type)((clojure.asm.Type)ifn_type50));
        ((clojure.asm.commons.GeneratorAdapter)gen189).loadArgs();
        ((clojure.asm.commons.GeneratorAdapter)gen189).invokeStatic((clojure.asm.Type)((clojure.asm.Type)rt_type48), (clojure.asm.commons.Method)((clojure.asm.commons.Method)((clojure.asm.commons.Method)clojure.asm.commons.Method.getMethod((java.lang.String)((java.lang.String)"clojure.lang.ISeq seq(Object)")))));
        ((clojure.asm.commons.GeneratorAdapter)gen189).invokeInterface((clojure.asm.Type)((clojure.asm.Type)ifn_type50), (clojure.asm.commons.Method)((clojure.asm.commons.Method)new clojure.asm.commons.Method((java.lang.String)((java.lang.String)"applyTo"), (clojure.asm.Type)((clojure.asm.Type)obj_type38), (clojure.asm.Type[])((clojure.asm.Type[])((IFn)const__58.getRawRoot()).invoke(RT.vector(iseq_type51))))));
        ((clojure.asm.commons.GeneratorAdapter)gen189).pop();
        ((clojure.asm.commons.GeneratorAdapter)gen189).goTo((clojure.asm.Label)((clojure.asm.Label)end_label191));
        ((clojure.asm.commons.GeneratorAdapter)gen189).mark((clojure.asm.Label)((clojure.asm.Label)no_main_label190));
        {
         Object msg192 = ((IFn)const__23.getRawRoot()).invoke(impl_pkg_name32, "/", prefix11, main_name45, " not defined");
         clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("throw new ", ((java.lang.String)clojure.lang.Compiler.printClass(((java.lang.Object)ex_type52))), "(\"", msg192, "\");")));
         ((clojure.asm.commons.GeneratorAdapter)gen189).throwException((clojure.asm.Type)((clojure.asm.Type)ex_type52), (java.lang.String)((java.lang.String)msg192));
        }
        ((clojure.asm.commons.GeneratorAdapter)gen189).mark((clojure.asm.Label)((clojure.asm.Label)end_label191));
        ((clojure.asm.commons.GeneratorAdapter)gen189).returnValue();
        clojure.lang.Compiler.untab();
        clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
        ((clojure.asm.commons.GeneratorAdapter)gen189).endMethod();
       }
      } else {
      }
      {
       Object seq_5688193 = ((IFn)const__8.getRawRoot()).invoke(exposes8);
       Object chunk_5689194 = null;
       long count_5690195 = 0L;
       long i_5691196 = 0L;
       while(true) {
        if (clojure.lang.Numbers.lt((long)i_5691196, (long)count_5690195)) {
         {
          Object vec__5692197 = ((java.lang.Object)((clojure.lang.Indexed)chunk_5689194).nth((int)RT.intCast(i_5691196)));
          Object f198 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__5692197), (int)RT.intCast(0L), ((java.lang.Object)null)));
          Object map__5693199 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__5692197), (int)RT.intCast(1L), ((java.lang.Object)null)));
          Object __r3643;
          Object __r3644 = ((IFn)const__7.getRawRoot()).invoke(map__5693199);
          if (__r3644 != null && !(__r3644 == Boolean.FALSE)) {
           __r3643 = ((clojure.lang.PersistentHashMap)clojure.lang.PersistentHashMap.create((clojure.lang.ISeq)((clojure.lang.ISeq)((IFn)const__8.getRawRoot()).invoke(map__5693199))));
          } else {
           __r3643 = map__5693199;
          }
          Object map__5693200 = __r3643;
          Object getter201 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__5693200), ((java.lang.Object)const__80)));
          Object setter202 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__5693200), ((java.lang.Object)const__81)));
          {
           Object fld203 = ((IFn)const__82.getRawRoot()).invoke(super24, ((IFn)const__23.getRawRoot()).invoke(f198));
           Object ftype204 = ((IFn)totype36).invoke(((java.lang.Class)((java.lang.reflect.Field)fld203).getType()));
           boolean static_QMARK_205 = java.lang.reflect.Modifier.isStatic((int)((java.lang.reflect.Field)fld203).getModifiers());
           Object __r3645;
           if (static_QMARK_205) {
            __r3645 = Integer.valueOf(clojure.asm.Opcodes.ACC_STATIC);
           } else {
            __r3645 = const__25;
           }
           Object acc206 = ((java.lang.Number)clojure.lang.Numbers.add((long)clojure.asm.Opcodes.ACC_PUBLIC, ((java.lang.Object)__r3645)));
           Object __r3647 = getter201;
           if (__r3647 != null && !(__r3647 == Boolean.FALSE)) {
            {
             Object m207 = new clojure.asm.commons.Method((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(getter201)), (clojure.asm.Type)((clojure.asm.Type)ftype204), (clojure.asm.Type[])((clojure.asm.Type[])((IFn)to_types37).invoke(clojure.lang.PersistentVector.EMPTY)));
             Object gen208 = new clojure.asm.commons.GeneratorAdapter((int)RT.intCast(acc206), (clojure.asm.commons.Method)((clojure.asm.commons.Method)m207), (java.lang.String)((java.lang.String)null), (clojure.asm.Type[])((clojure.asm.Type[])null), (clojure.asm.ClassVisitor)((clojure.asm.ClassVisitor)cv29));
             Object __r3648;
             if (static_QMARK_205) {
              __r3648 = "static ";
             } else {
              __r3648 = "";
             }
             clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("public ", __r3648, ((java.lang.String)clojure.lang.Compiler.printClass(((java.lang.Object)ftype204))), " ", ((IFn)const__23.getRawRoot()).invoke(getter201), "() {")));
             clojure.lang.Compiler.tab();
             ((clojure.asm.MethodAdapter)gen208).visitCode();
             clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("return ", f198, ";")));
             if (static_QMARK_205) {
              ((clojure.asm.commons.GeneratorAdapter)gen208).getStatic((clojure.asm.Type)((clojure.asm.Type)ctype34), (java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(f198)), (clojure.asm.Type)((clojure.asm.Type)ftype204));
             } else {
              ((clojure.asm.commons.GeneratorAdapter)gen208).loadThis();
              ((clojure.asm.commons.GeneratorAdapter)gen208).getField((clojure.asm.Type)((clojure.asm.Type)ctype34), (java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(f198)), (clojure.asm.Type)((clojure.asm.Type)ftype204));
             }
             clojure.lang.Compiler.untab();
             clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
             ((clojure.asm.commons.GeneratorAdapter)gen208).returnValue();
             ((clojure.asm.commons.GeneratorAdapter)gen208).endMethod();
            }
           } else {
           }
           Object __r3651 = setter202;
           if (__r3651 != null && !(__r3651 == Boolean.FALSE)) {
            {
             Object m209 = new clojure.asm.commons.Method((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(setter202)), (clojure.asm.Type)((clojure.asm.Type)((clojure.asm.Type)clojure.asm.Type.VOID_TYPE)), (clojure.asm.Type[])((clojure.asm.Type[])((IFn)const__58.getRawRoot()).invoke(RT.vector(ftype204))));
             Object gen210 = new clojure.asm.commons.GeneratorAdapter((int)RT.intCast(acc206), (clojure.asm.commons.Method)((clojure.asm.commons.Method)m209), (java.lang.String)((java.lang.String)null), (clojure.asm.Type[])((clojure.asm.Type[])null), (clojure.asm.ClassVisitor)((clojure.asm.ClassVisitor)cv29));
             Object __r3652;
             if (static_QMARK_205) {
              __r3652 = "static ";
             } else {
              __r3652 = "";
             }
             clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("public ", __r3652, "void ", ((IFn)const__23.getRawRoot()).invoke(setter202), "(", ((java.lang.String)clojure.lang.Compiler.printClass(((java.lang.Object)ftype204))), " value) {")));
             clojure.lang.Compiler.tab();
             ((clojure.asm.MethodAdapter)gen210).visitCode();
             if (static_QMARK_205) {
              clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(((java.lang.String)clojure.lang.Compiler.printClass(((java.lang.Object)ctype34))), ".", f198, " = value;")));
              ((clojure.asm.commons.GeneratorAdapter)gen210).loadArgs();
              ((clojure.asm.commons.GeneratorAdapter)gen210).putStatic((clojure.asm.Type)((clojure.asm.Type)ctype34), (java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(f198)), (clojure.asm.Type)((clojure.asm.Type)ftype204));
             } else {
              clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("this.", f198, " = value;")));
              ((clojure.asm.commons.GeneratorAdapter)gen210).loadThis();
              ((clojure.asm.commons.GeneratorAdapter)gen210).loadArgs();
              ((clojure.asm.commons.GeneratorAdapter)gen210).putField((clojure.asm.Type)((clojure.asm.Type)ctype34), (java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(f198)), (clojure.asm.Type)((clojure.asm.Type)ftype204));
             }
             clojure.lang.Compiler.untab();
             clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
             ((clojure.asm.commons.GeneratorAdapter)gen210).returnValue();
             ((clojure.asm.commons.GeneratorAdapter)gen210).endMethod();
            }
           } else {
           }
          }
          long i_5691196___aux = clojure.lang.Numbers.unchecked_inc((long)i_5691196);
          i_5691196 = i_5691196___aux;
          continue;
         }
        } else {
         {
          Object temp__4117__auto__211 = ((IFn)const__8.getRawRoot()).invoke(seq_5688193);
          Object __r3655 = temp__4117__auto__211;
          if (__r3655 != null && !(__r3655 == Boolean.FALSE)) {
           {
            Object seq_5688212 = temp__4117__auto__211;
            Object __r3657 = ((IFn)const__64.getRawRoot()).invoke(seq_5688212);
            if (__r3657 != null && !(__r3657 == Boolean.FALSE)) {
             {
              Object c__4343__auto__213 = ((IFn)const__65.getRawRoot()).invoke(seq_5688212);
              java.lang.Object seq_5688193___aux = ((IFn)const__66.getRawRoot()).invoke(seq_5688212);
              java.lang.Object chunk_5689194___aux = c__4343__auto__213;
              long count_5690195___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__213)));
              long i_5691196___aux = clojure.lang.RT.intCast((long)0L);
              seq_5688193 = seq_5688193___aux;
              chunk_5689194 = chunk_5689194___aux;
              count_5690195 = count_5690195___aux;
              i_5691196 = i_5691196___aux;
              continue;
             }
            } else {
             {
              Object vec__5694214 = ((IFn)const__69.getRawRoot()).invoke(seq_5688212);
              Object f215 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__5694214), (int)RT.intCast(0L), ((java.lang.Object)null)));
              Object map__5695216 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__5694214), (int)RT.intCast(1L), ((java.lang.Object)null)));
              Object __r3658;
              Object __r3659 = ((IFn)const__7.getRawRoot()).invoke(map__5695216);
              if (__r3659 != null && !(__r3659 == Boolean.FALSE)) {
               __r3658 = ((clojure.lang.PersistentHashMap)clojure.lang.PersistentHashMap.create((clojure.lang.ISeq)((clojure.lang.ISeq)((IFn)const__8.getRawRoot()).invoke(map__5695216))));
              } else {
               __r3658 = map__5695216;
              }
              Object map__5695217 = __r3658;
              Object getter218 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__5695217), ((java.lang.Object)const__80)));
              Object setter219 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__5695217), ((java.lang.Object)const__81)));
              {
               Object fld220 = ((IFn)const__82.getRawRoot()).invoke(super24, ((IFn)const__23.getRawRoot()).invoke(f215));
               Object ftype221 = ((IFn)totype36).invoke(((java.lang.Class)((java.lang.reflect.Field)fld220).getType()));
               boolean static_QMARK_222 = java.lang.reflect.Modifier.isStatic((int)((java.lang.reflect.Field)fld220).getModifiers());
               Object __r3660;
               if (static_QMARK_222) {
                __r3660 = Integer.valueOf(clojure.asm.Opcodes.ACC_STATIC);
               } else {
                __r3660 = const__25;
               }
               Object acc223 = ((java.lang.Number)clojure.lang.Numbers.add((long)clojure.asm.Opcodes.ACC_PUBLIC, ((java.lang.Object)__r3660)));
               Object __r3662 = getter218;
               if (__r3662 != null && !(__r3662 == Boolean.FALSE)) {
                {
                 Object m224 = new clojure.asm.commons.Method((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(getter218)), (clojure.asm.Type)((clojure.asm.Type)ftype221), (clojure.asm.Type[])((clojure.asm.Type[])((IFn)to_types37).invoke(clojure.lang.PersistentVector.EMPTY)));
                 Object gen225 = new clojure.asm.commons.GeneratorAdapter((int)RT.intCast(acc223), (clojure.asm.commons.Method)((clojure.asm.commons.Method)m224), (java.lang.String)((java.lang.String)null), (clojure.asm.Type[])((clojure.asm.Type[])null), (clojure.asm.ClassVisitor)((clojure.asm.ClassVisitor)cv29));
                 Object __r3663;
                 if (static_QMARK_222) {
                  __r3663 = "static ";
                 } else {
                  __r3663 = "";
                 }
                 clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("public ", __r3663, ((java.lang.String)clojure.lang.Compiler.printClass(((java.lang.Object)ftype221))), " ", ((IFn)const__23.getRawRoot()).invoke(getter218), "() {")));
                 clojure.lang.Compiler.tab();
                 ((clojure.asm.MethodAdapter)gen225).visitCode();
                 clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("return ", f215, ";")));
                 if (static_QMARK_222) {
                  ((clojure.asm.commons.GeneratorAdapter)gen225).getStatic((clojure.asm.Type)((clojure.asm.Type)ctype34), (java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(f215)), (clojure.asm.Type)((clojure.asm.Type)ftype221));
                 } else {
                  ((clojure.asm.commons.GeneratorAdapter)gen225).loadThis();
                  ((clojure.asm.commons.GeneratorAdapter)gen225).getField((clojure.asm.Type)((clojure.asm.Type)ctype34), (java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(f215)), (clojure.asm.Type)((clojure.asm.Type)ftype221));
                 }
                 clojure.lang.Compiler.untab();
                 clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
                 ((clojure.asm.commons.GeneratorAdapter)gen225).returnValue();
                 ((clojure.asm.commons.GeneratorAdapter)gen225).endMethod();
                }
               } else {
               }
               Object __r3666 = setter219;
               if (__r3666 != null && !(__r3666 == Boolean.FALSE)) {
                {
                 Object m226 = new clojure.asm.commons.Method((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(setter219)), (clojure.asm.Type)((clojure.asm.Type)((clojure.asm.Type)clojure.asm.Type.VOID_TYPE)), (clojure.asm.Type[])((clojure.asm.Type[])((IFn)const__58.getRawRoot()).invoke(RT.vector(ftype221))));
                 Object gen227 = new clojure.asm.commons.GeneratorAdapter((int)RT.intCast(acc223), (clojure.asm.commons.Method)((clojure.asm.commons.Method)m226), (java.lang.String)((java.lang.String)null), (clojure.asm.Type[])((clojure.asm.Type[])null), (clojure.asm.ClassVisitor)((clojure.asm.ClassVisitor)cv29));
                 Object __r3667;
                 if (static_QMARK_222) {
                  __r3667 = "static ";
                 } else {
                  __r3667 = "";
                 }
                 clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("public ", __r3667, "void ", ((IFn)const__23.getRawRoot()).invoke(setter219), "(", ((java.lang.String)clojure.lang.Compiler.printClass(((java.lang.Object)ftype221))), " value) {")));
                 clojure.lang.Compiler.tab();
                 ((clojure.asm.MethodAdapter)gen227).visitCode();
                 if (static_QMARK_222) {
                  clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(((java.lang.String)clojure.lang.Compiler.printClass(((java.lang.Object)ctype34))), ".", f215, " = value;")));
                  ((clojure.asm.commons.GeneratorAdapter)gen227).loadArgs();
                  ((clojure.asm.commons.GeneratorAdapter)gen227).putStatic((clojure.asm.Type)((clojure.asm.Type)ctype34), (java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(f215)), (clojure.asm.Type)((clojure.asm.Type)ftype221));
                 } else {
                  clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke("this.", f215, " = value;")));
                  ((clojure.asm.commons.GeneratorAdapter)gen227).loadThis();
                  ((clojure.asm.commons.GeneratorAdapter)gen227).loadArgs();
                  ((clojure.asm.commons.GeneratorAdapter)gen227).putField((clojure.asm.Type)((clojure.asm.Type)ctype34), (java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(f215)), (clojure.asm.Type)((clojure.asm.Type)ftype221));
                 }
                 clojure.lang.Compiler.untab();
                 clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
                 ((clojure.asm.commons.GeneratorAdapter)gen227).returnValue();
                 ((clojure.asm.commons.GeneratorAdapter)gen227).endMethod();
                }
               } else {
               }
              }
              java.lang.Object seq_5688193___aux = ((IFn)const__70.getRawRoot()).invoke(seq_5688212);
              java.lang.Object chunk_5689194___aux = null;
              long count_5690195___aux = 0L;
              long i_5691196___aux = 0L;
              seq_5688193 = seq_5688193___aux;
              chunk_5689194 = chunk_5689194___aux;
              count_5690195 = count_5690195___aux;
              i_5691196 = i_5691196___aux;
              continue;
             }
            }
           }
          } else {
          }
         }
        }
        break;
       }
      }
      ((clojure.asm.ClassWriter)cv29).visitEnd();
      clojure.lang.Compiler.untab();
      clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)"}"));
      clojure.lang.Compiler.writeSourceFile((java.lang.String)((java.lang.String)cname30), (java.lang.String)((java.lang.String)((IFn)const__23.getRawRoot()).invoke(const__56.get())));
      return RT.vector(cname30, ((byte[])((clojure.asm.ClassWriter)cv29).toByteArray()));
     } finally {
      ((IFn)const__83.getRawRoot()).invoke();
     }
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
