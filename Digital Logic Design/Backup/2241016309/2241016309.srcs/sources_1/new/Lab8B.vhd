----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 01/06/2024 01:47:28 PM
-- Design Name: 
-- Module Name: Lab8B - Dataflow
-- Project Name: 
-- Target Devices: 
-- Tool Versions: 
-- Description: 
-- 
-- Dependencies: 
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
-- 
----------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx leaf cells in this code.
--library UNISIM;
--use UNISIM.VComponents.all;
--E. Jagadeeswar Patro - 2241016309
entity Lab8B is
    Port ( a : in STD_LOGIC;
           b : in STD_LOGIC;
           p : out STD_LOGIC;
           q : out STD_LOGIC;
           r : out STD_LOGIC;
           s : out STD_LOGIC);
end Lab8B;
architecture Dataflow of Lab8B is
begin
p <= a and b;
q <= a and (not b);
r <= '0';
s <= b;
end Dataflow;
